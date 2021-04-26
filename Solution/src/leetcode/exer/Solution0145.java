package leetcode.exer;

import Code.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Linghan
 * @version 2021/4/21 21:02
 */
public class Solution0145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        //1递归
        ArrayList<Integer> out=new ArrayList<>();
        postorder(root,out);

        return out;
    }
    void postorder(TreeNode root, ArrayList<Integer> out){//1递归
        if(root==null)
            return;
        postorder(root.left,out);
        postorder(root.right,out);
        out.add(root.val);
    }

}
