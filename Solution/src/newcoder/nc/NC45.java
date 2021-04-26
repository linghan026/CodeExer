package newcoder.nc;

import Code.Util.TreeNode;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author Linghan
 * @version 2021/4/22 9:46
 */
public class NC45 {
    public int[][] threeOrders (TreeNode root) {
        // write code here
        ArrayList<Integer> out1=new ArrayList<>();
        preorder(root,out1);
        ArrayList<Integer> out2=new ArrayList<>();
        inorder(root,out2);
        ArrayList<Integer> out3=new ArrayList<>();
        postorder(root,out3);
        int[][] out=new int[3][];


        int[] tmpArr1 = new int[out1.size()];
        for(int i=0;i<out1.size();i++){
            tmpArr1[i]=out1.get(i);
        }
        out[0]=tmpArr1;
        int[] tmpArr2 = new int[out1.size()];
        for(int i=0;i<out2.size();i++){
            tmpArr2[i]=out2.get(i);
        }
        out[1]=tmpArr2;
        int[] tmpArr3 = new int[out1.size()];
        for(int i=0;i<out3.size();i++){
            tmpArr3[i]=out3.get(i);
        }
        out[2]=tmpArr3;
        return out;
    }
    void preorder(TreeNode root, ArrayList<Integer> out1){
        if(root==null)
            return;
        out1.add(root.val);
        preorder(root.left,out1);
        preorder(root.right,out1);
    }
    void inorder(TreeNode root, ArrayList<Integer> out2){//1递归
        if(root==null)
            return;
        inorder(root.left,out2);
        out2.add(root.val);
        inorder(root.right,out2);
    }
    void postorder(TreeNode root, ArrayList<Integer> out3){//1递归
        if(root==null)
            return;
        postorder(root.left,out3);
        postorder(root.right,out3);
        out3.add(root.val);
    }
    @Test
    public void test(){
        TreeNode root0 = new TreeNode(3);
        TreeNode root1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(1);
        TreeNode root3 = new TreeNode(5);

        root0.left  = root1;
        root0.right = root2;
        root1.right = root3;

        int[][] ints = threeOrders(root0);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j]);
            }
            System.out.println();

        }
    }
}
