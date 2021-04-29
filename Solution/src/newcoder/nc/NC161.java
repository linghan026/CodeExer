package newcoder.nc;

import Code.Util.TreeNode;

import java.util.ArrayList;

/**直接从LeetCode 94 复制
 * @author Linghan
 * @version 2021/4/29 8:41
 */
public class NC161 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param root TreeNode类
     * @return int整型一维数组
     */
    public int[] inorderTraversal (TreeNode root) {
        ArrayList<Integer> out=new ArrayList<>();
        inorder(root,out);
        int[] out1=new int[out.size()];
        for(int i=0;i<out.size();i++){
            out1[i]=out.get(i);
        }
        return out1;
    }
    void inorder(TreeNode root, ArrayList<Integer> out){
        if(root==null)
            return;
        inorder(root.left,out);
        out.add(root.val);
        inorder(root.right,out);
    }
}
