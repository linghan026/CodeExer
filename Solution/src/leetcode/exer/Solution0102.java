package leetcode.exer;

import Code.Util.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Linghan
 * @version 2021/4/21 21:31
 */
public class Solution0102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> stk = new LinkedList<TreeNode>();
        if(root == null)
            return res;

        stk.offer(root);// 队列放入根节点

        while(!stk.isEmpty()){//循环（直到队列为空）

            int i= stk.size();//当前队列中仅有一层的节点
            List<Integer> curlayer=new ArrayList<Integer>();
            for (int j = 0; j < i; j++) {//当前层的节点全部出列 并把当前层的子节点入列
                TreeNode cur=stk.poll();//队列出列 置为当前点
                curlayer.add(cur.val);//输出
                //队列放入当前点左节点右节点（判断是否为空）
                if(cur.left !=null){
                    stk.offer(cur.left);
                }
                if(cur.right !=null){
                    stk.offer(cur.right);
                }
            }
            res.add(curlayer);//存入将当前层

        }
        return res;//结束
    }
}
