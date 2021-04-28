package leetcode.exer;

import org.junit.Test;

/**
 * @author Linghan
 * @version 2021/4/27 19:47
 */
public class Solution0485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int slow = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                max = Math.max(max, i - slow);
                slow = i + 1;
            } else if (i == nums.length - 1) {
                max = Math.max(max, i - slow+1);
            }
        }
        return max;
    }
    @Test
    public void test(){
        int[] nums={1,1,0,0,1,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
