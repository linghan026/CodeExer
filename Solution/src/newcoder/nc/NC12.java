package newcoder.nc;

import Code.Util.TreeNode;

/**直接复制LeetCode105
 * @author Linghan
 * @version 2021/4/29 8:34
 */
public class NC12 {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        return build(pre,0,pre.length-1,in,0,in.length-1);
    }
    TreeNode build(int[] preorder, int preStart, int preEnd,
                   int[] inorder,  int inStart,  int inEnd) {

        if (preStart > preEnd) {//停止条件
            return null;
        }

        // root 节点对应的值就是前序遍历数组的第一个元素
        int rootVal = preorder[preStart];//根节点的值

        // rootVal 在中序遍历数组中的索引（查找根节点在中序遍历数组中的位置index）
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }

        int leftSize = index - inStart;//可以计算出，左子树的长度：根节点位置-中序遍历数组起始点位置

        // 先构造出当前根节点
        TreeNode root = new TreeNode(rootVal);
        // 递归构造左右子树//计算左右子树的起止位置
        root.left = build(preorder, preStart + 1, preStart + leftSize,
                inorder, inStart, index - 1);

        root.right = build(preorder, preStart + leftSize + 1, preEnd,
                inorder, index + 1, inEnd);
        return root;
    }
}
