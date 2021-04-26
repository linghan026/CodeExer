package leetcode.exer;

import Code.Util.TreeNode;
import org.junit.Test;


/**@see <a href="https://mp.weixin.qq.com/s/OlpaDhPDTJlQ5MJ8tsARlA">手把手带你刷二叉树（第二期）</a>
 * @see <a href="https://leetcode-cn.com/problems/maximum-binary-tree/">#654. 最大二叉树</a>
 * @author Linghan
 * @version 2021/4/20 11:10
 */
public class Solution0654MaximumBinaryTree {
    /* 主函数 */
    TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    /* 将 nums[lo..hi] 构造成符合条件的树，返回根节点 */
    TreeNode build(int[] nums, int lo, int hi) {
        // base case
        if (lo > hi) {
            return null;
        }

        // 找到数组中的最大值和对应的索引
        int index = -1, maxVal = Integer.MIN_VALUE;
        for (int i = lo; i <= hi; i++) {
            if (maxVal < nums[i]) {
                index = i;
                maxVal = nums[i];
            }
        }

        TreeNode root = new TreeNode(maxVal);
        // 递归调用构造左右子树
        root.left = build(nums, lo, index - 1);
        root.right = build(nums, index + 1, hi);

        return root;
    }
    @Test
    public void test(){
        int[] nums={3,2,1,6,0,5};
        constructMaximumBinaryTree(nums);

    }
}
