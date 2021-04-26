package leetcode.offer;
/**
 * 
 * @Description 剑指Offer03
 * @author YinLinghan 1457851494@qq.com
 * @version
 * @date 2021年1月17日下午5:17:55
 *
 */
public class Offer03 {
    public int findRepeatNumber(int[] nums) 
    {
    	for(int i=0;i<nums.length-1;i++)
    	{
    		for(int j=i+1;j<nums.length;j++)
    		{
    			if(nums[i]==nums[j])
    				return nums[i];
    		}
    	}
    	return -1;
    }
    
//    public int findRepeatNumber(int[] nums) {
//        int[] arr = new int[nums.length];//长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内 不会越界
//        for(int i = 0; i < nums.length; i++){
//            arr[nums[i]]++;
//            if(arr[nums[i]] > 1) return nums[i];
//        }
//        return -1;
//    }
}
