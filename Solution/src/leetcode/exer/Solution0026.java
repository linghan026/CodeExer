package leetcode.exer;

/**
 * @author Linghan
 * @version 2021/4/29 20:05
 */
public class Solution0026 {
    public int removeDuplicates(int[] nums) {
        int slow=0;
        for (int fast = 1; fast < nums.length; fast++) {
            if(nums[fast]==nums[slow])
                continue;
            nums[++slow]=nums[fast];
        }
        return slow+1;
    }
}
