package leetcode.exer;

import Code.Util.TreeNode;

/**	#226 翻转二叉树
 * @author Linghan
 * @version 2021/4/17 20:14
 */
public class Solution0226InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;
        TreeNode temp=invertTree(root.right);
        root.right=invertTree(root.left);
        root.left=temp;
        return root;
    }
}
