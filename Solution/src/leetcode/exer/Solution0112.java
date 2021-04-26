package leetcode.exer;

import Code.Util.TreeNode;

import java.lang.annotation.Target;

import static java.lang.Math.max;

/**
 * @author Linghan
 * @version 2021/4/22 13:19
 */
public class Solution0112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        //法二：官方递归
        if(root == null) {
            return false;
        }
        if(root.left==null || root.right == null) {
            return targetSum == root.val;
        }
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);

        //法一：  递归
//        prePathSum(root, 0,targetSum);
//        return answer;
//        sum+=root.val;
//        if(root.left==null&&root.right==null){
//            if(sum==targetSum)
//                answer=true;
//        }
//        prePathSum(root.left,sum,targetSum);
//        prePathSum(root.right,sum,targetSum);

    }
    private boolean answer=false;
    void prePathSum(TreeNode root, int sum, int targetSum){
        if(root == null)
            return;
        sum+=root.val;
        if(root.left==null&&root.right==null){
            if(sum==targetSum)
                answer=true;
        }
        prePathSum(root.left,sum,targetSum);
        prePathSum(root.right,sum,targetSum);
    }
}
