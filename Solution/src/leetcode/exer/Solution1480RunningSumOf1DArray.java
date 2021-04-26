package leetcode.exer;

import org.junit.Test;

public class Solution1480RunningSumOf1DArray
{
    public static int[] runningSum(int[] nums) 
    {
    	for(int i=1;i<nums.length;i++)
    	{
    		nums[i]+=nums[i-1];
    	}
    	return nums;
    }
	@Test
	public void test(){
		int[] nums= {1,2,3,4};
		nums = runningSum(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);

		}
	}
}
