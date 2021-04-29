package newcoder.nc;

import Code.Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**直接复制LeetCode101
 * @author Linghan
 * @version 2021/4/29 8:28
 */
public class NC16 {
    /**
     *
     * @param root TreeNode类
     * @return bool布尔型
     */
    public boolean isSymmetric (TreeNode root) {
        // write code here
        //法二：改成一个队列
        if (root == null) {
            return true;
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
}
