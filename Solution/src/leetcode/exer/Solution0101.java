package leetcode.exer;

import Code.Util.TreeNode;
import org.junit.Test;

import java.util.*;

/**
 * @author Linghan
 * @version 2021/4/22 10:42
 */
public class Solution0101 {
    public boolean isSymmetric(TreeNode root) {
        //法一：两个队列
//        if (root == null) {
//            return false;
//        }
//        Deque<TreeNode> stackL = new LinkedList<>();
//        Deque<TreeNode> stackR = new LinkedList<>();//镜像
//        TreeNode nodeL = root;//根节点
//        TreeNode nodeR = root;//根节点
//
//        while (!stackL.isEmpty() || nodeL != null) {
//            while (nodeL != null) { //直到左节点为空，结束内循环
//                if(nodeR == null )
//                    return false;
//                if(nodeL.val != nodeR.val)
//                    return false;
//                System.out.print(nodeL.val);
//                System.out.print(nodeR.val);
//                stackL.push(nodeL);//当前节点存入栈
//                stackR.push(nodeR);//当前节点存入栈
//                nodeL = nodeL.left;//换成当前节点的左节点
//                nodeR = nodeR.right;//换成当前节点的左节点
//            }
//            nodeL = stackL.pop();//换为最后放入栈的节点，继续内循环存右节点的左节点
//            nodeR = stackR.pop();
//            nodeL = nodeL.right;
//            nodeR = nodeR.left;
//        }
//        return true;

        //法二：改成一个队列
        if (root == null) {
            return false;
        }
        Queue<TreeNode> stack = new LinkedList<>();
        TreeNode nodeL = root;//根节点
        TreeNode nodeR = root;//根节点
        stack.offer(nodeL);
        stack.offer(nodeR);
        while (!stack.isEmpty()) {
            nodeL=stack.poll();
            nodeR=stack.poll();//没有元素时返回null

            if(nodeL==null && nodeR==null)
                continue;
            if(nodeL==null || nodeR==null)
                return false;
            if( nodeL.val != nodeR.val)
                return false;
            stack.offer(nodeL.left);
            stack.offer(nodeR.right);

            stack.offer(nodeL.right);
            stack.offer(nodeR.left);
        }
        return true;
    }

    //迭代法 前序遍历
    List<Integer> preorder1(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;//根节点

        while (!stack.isEmpty() || node != null) {
            while (node != null) { //直到左节点为空，结束内循环
                res.add(node.val);//当前值
                System.out.print(node.val);
                stack.push(node);//当前节点存入栈
                node = node.left;//换成当前节点的左节点
            }
            node = stack.pop();//换为最后放入栈的节点，继续内循环存右节点的左节点
            node = node.right;
        }
        return res;
    }


    //递归法 前序遍历
    void preorder(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.val);
        preorder(root.left);
        preorder(root.right);

    }
    //左右互换递归
    void preorder2(TreeNode root) {
        if (root == null)
            return;

        System.out.print(root.val);
        preorder2(root.right);
        preorder2(root.left);

    }
    @Test
    public void test(){
        TreeNode root0 = new TreeNode(1);

        TreeNode root1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(2);

        TreeNode root3 = new TreeNode(3);
//        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(3);
//        TreeNode root6 = new TreeNode(2);


        root0.left  = root1;
        root0.right = root2;

        root1.left  = root3;
//        root1.right = root4;

        root2.left  = root5;
//        root2.right = root6;
        System.out.println(isSymmetric(root0));
    }
}
