package leetcode.exer;

import Code.Util.Node;
import Code.Util.TreeNode;

import java.util.*;

/**
 * @author Linghan
 * @version 2021/4/22 13:45
 */
public class Solution0117 {
    // 主函数
    Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> stk = new LinkedList<>();
        stk.offer(root);// 队列放入根节点

        while (!stk.isEmpty()) {//循环（直到队列为空）
            int i = stk.size();//当前队列中仅有一层的节点
            Node cur = null;
            for (int j = 0; j < i; j++) {//当前层的节点全部出列 并把当前层的子节点入列
                Node nex = stk.poll();//队列出列
                if (j!=0){
                    cur.next = nex;
                }
                //队列放入当前点左节点右节点（判断是否为空）
//                if (cur.left != null) {
//                    stk.offer(cur.left);
//                }
//                if (cur.right != null) {
//                    stk.offer(cur.right);
//                }
                if(nex != null){
                    if (nex.left != null) {
                        stk.offer(nex.left);
                    }
                    if (nex.right != null) {
                        stk.offer(nex.right);
                    }
                }
                cur=nex;
            }
        }
        return root;//结束
    }
}
