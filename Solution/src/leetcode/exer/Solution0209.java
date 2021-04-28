package leetcode.exer;

import org.junit.Test;

/**
 * @author Linghan
 * @version 2021/4/27 20:43
 */
public class Solution0209 {
    public int minSubArrayLen(int target, int[] nums){
        int slow = 0;
        int fast = 0;
        int sum = nums[0];
        int minLen = nums.length+1;
        while (true) {
            //1 小了
            if(sum<target){
                fast++;
                if(fast>=nums.length)
                    break;
                sum+=nums[fast];
            }
            //2 大了 等于
            if(sum>=target){
                minLen=Math.min(minLen,fast-slow+1);
                if(minLen==1)
                    return 1;
                sum=sum-nums[slow];
                slow++;
            }
        }
        if(minLen>nums.length)
            return 0;
        else
            return minLen;
    }


    public int minSubArrayLen2(int target, int[] nums) {//理解错了，这是等于目标值的，要求是大于等于目标值
        int slow = 0;
        int fast = 0;
        int sum = nums[0];
        int minLen = nums.length+1;
        while (fast < nums.length) {
            if (sum > target && slow == fast) {//指针相等
                slow++;
                fast++;
                if(fast>=nums.length)
                    break;
                sum = nums[fast];
            } else if (sum > target) {//指针不等
                sum -= nums[slow];
                slow++;
            }

            if (sum < target) {
                fast++;
                if(fast>=nums.length)
                    break;
                sum += nums[fast];
            }

            if (sum == target && slow == fast) {//指针相等
                return 1;
            } else if (sum == target) {//指针不等
                minLen = Math.min(minLen, fast - slow + 1);
                fast++;
                if(fast>=nums.length)
                    break;
                sum = sum - nums[slow] + nums[fast];
                slow++;
            }
        }
        if(minLen>nums.length)
            return 0;
        else
            return minLen;
    }

    @Test
    public void test() {
        int[] nums = {1,2,3,4,5};
        System.out.println(minSubArrayLen(11, nums));

    }
}
