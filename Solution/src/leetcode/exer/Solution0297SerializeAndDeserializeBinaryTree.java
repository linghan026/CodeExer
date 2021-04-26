package leetcode.exer;

import Code.Util.TreeNode;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Linghan
 * @version 2021/4/20 17:46
 * @see <a href="https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/">#297. 二叉树的序列化与反序列化</a>
 * @see <a href="https://mp.weixin.qq.com/s/DVX2A1ha4xSecEXLxW_UsA">二叉树的题，就那几个框架，枯燥至极</a>
 */
public class Solution0297SerializeAndDeserializeBinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        sb=serialize(root,sb);
        String str = sb.toString();
        return str;
    }
    public StringBuilder serialize(TreeNode root,StringBuilder sb){
        if(root == null)
            return sb.append("#").append(",");
        sb.append(root.val).append(",");

        serialize(root.left,sb);
        serialize(root.right,sb);

        return sb;
    }


    // Decodes your encoded data to tree.
//        public TreeNode deserialize(String data) {
//            String[] sb = data.split(",");
////            StringBuilder sb = new StringBuilder();
////            for (String s:strs) {
////                sb.append(s);
////            }
//
//            return deserialize(sb);
//        }
//        public TreeNode deserialize(String[] sb){
//            if(sb[0])
//            TreeNode root=new TreeNode()
//
//        }

    void traverse(TreeNode root) {//中序遍历函数
        if (root == null) return;
        // 初始化队列，将 root 加入队列
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);//入列


        while (!q.isEmpty()) {
            TreeNode cur = q.poll();//队列头部元素出列

            /* 层级遍历代码位置 */
            System.out.println(cur.val);//头部元素处理
            /*****************/

            if (cur.left != null) {
                q.offer(cur.left);//头部元素左子树入列
            }

            if (cur.right != null) {
                q.offer(cur.right);//头部元素右子树入列 同层元素在队列中相邻
            }
        }
    }

    @Test
    public void test1() {
        TreeNode root0 = new TreeNode(1);
        TreeNode root1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(3);
        TreeNode root3 = new TreeNode(4);

        root0.left  = root1;
        root0.right = root2;
        root1.right = root3;

        traverse(root0);

        String str1=serialize(root0);
        System.out.println(str1);

    }
}


// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));