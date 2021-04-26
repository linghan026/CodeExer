package leetcode.exer;

import Code.Util.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Linghan
 * @version 2021/4/21 20:16
 */
public class Solution0144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> out=new ArrayList<>();
        preorder(root,out);
        return out;
    }
    void preorder(TreeNode root,ArrayList<Integer> out){
        if(root==null)
            return;

        out.add(root.val);
        preorder(root.left,out);
        preorder(root.right,out);
    }
    List<Integer> preorder1(TreeNode root,ArrayList<Integer> out){
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return res;
    }
}
