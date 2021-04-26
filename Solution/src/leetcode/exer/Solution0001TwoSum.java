package leetcode.exer;

import org.junit.Test;

public class Solution0001TwoSum
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] result=new int[2];
    	Loop:for(int i=0;i<nums.length;i++)
    	{
    		for(int j=i+1;j<nums.length;j++)
    		{
    			if(nums[i]+nums[j]==target)
    			{
    				result[0]=i;
                    result[1]=j;
    				break Loop;
    			}	
    		}
    	}
        return result;
    }
    @Test
	public void test(){
		System.out.println("git");
		System.out.println("git");
		System.out.println("github");
	}
}
