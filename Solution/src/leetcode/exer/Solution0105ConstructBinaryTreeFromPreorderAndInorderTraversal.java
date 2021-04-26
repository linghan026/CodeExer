package leetcode.exer;

import Code.Util.TreeNode;

/**
 * @author Linghan
 * @version 2021/4/21 19:24
 * @see <a href="https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/">#105. 从前序与中序遍历序列构造二叉树</a>
 * @see <a href="https://mp.weixin.qq.com/s/OlpaDhPDTJlQ5MJ8tsARlA">手把手帮你刷通二叉树|第二期</a>
 */
public class Solution0105ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);

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
