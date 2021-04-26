package newcoder.nc;

import Code.Util.TreeNode;

/**	NC72
 * #226 翻转二叉树
 * @author Linghan
 * @version 2021/4/17 20:14
 */
public class NC72 {
    public TreeNode Mirror(TreeNode pRoot) {
        if(pRoot == null)
            return null;
        TreeNode temp= Mirror(pRoot.right);
        pRoot.right= Mirror(pRoot.left);
        pRoot.left=temp;

        return pRoot;
    }
}

