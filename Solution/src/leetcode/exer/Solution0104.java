package leetcode.exer;

import Code.Util.TreeNode;

import static java.lang.Math.max;

/**#104. 二叉树的最大深度
 * @author Linghan
 * @version 2021/4/22 10:15
 */
public class Solution0104 {
    public int maxDepth(TreeNode root) {
        //法一：前序遍历
        preDepth(root,0);
        return answer;
        //法二：


    }
    private int answer=0;
    void preDepth(TreeNode root,int Depth){
        if(root == null)
            return;
        if(root.left==null&&root.right==null){
            answer=max(Depth,answer);
        }
        preDepth(root.left,Depth+1);
        preDepth(root.right,Depth+1);

    }
    int postDepth(TreeNode root){
        if (root == null) {
            return 0;
        }
        int left_depth = postDepth(root.left);
        int right_depth = postDepth(root.right);
        return max(left_depth, right_depth) + 1;
    }
}
