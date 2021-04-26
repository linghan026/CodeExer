package leetcode.exer;

import Code.Util.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Linghan
 * @version 2021/4/21 20:55
 */
public class Solution0094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        //1递归
//        ArrayList<Integer> out=new ArrayList<>();
//        inorder(root,out);
//        return out;

        //2迭代
        List<Integer> res = new ArrayList<Integer>();
        Deque<TreeNode> stk = new LinkedList<TreeNode>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
    void inorder(TreeNode root, ArrayList<Integer> out){//1递归
        if(root==null)
            return;
        inorder(root.left,out);
        out.add(root.val);
        inorder(root.right,out);
    }

}
