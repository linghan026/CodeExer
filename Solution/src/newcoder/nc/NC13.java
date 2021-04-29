package newcoder.nc;

import Code.Util.TreeNode;

/**直接复制LeetCode104
 * @author Linghan
 * @version 2021/4/29 8:56
 */
public class NC13 {
    /**
     *
     * @param root TreeNode类
     * @return int整型
     */
    private int answer=0;
    public int maxDepth (TreeNode root) {
        // write code here
        preDepth(root,1);
        return answer;
    }
    void preDepth(TreeNode root,int Depth){
        if(root == null)
            return;
        if(root.left==null&&root.right==null){
            answer=Math.max(Depth,answer);
        }
        preDepth(root.left,Depth+1);
        preDepth(root.right,Depth+1);
    }
}
