package leetcode.exer;
/**
 *  #53
 *  <p>2021年1月9日下午4:57:12
 * @author YinLinghan 1457851494@qq.com
 */
public class Solution0053MaximumSubarray {
	/**
	 * show 方法的简述.
	 * <p>show 方法的详细说明第一行<br>
	 * show 方法的详细说明第二行
	 * @param nums true 表示显示，false 表示隐藏
	 * @return 没有返回值
	 */
    public int maxSubArray(int[] nums) {
    	int sums=0;
    	int maxsums=nums[0];
    	for(int i=1;i<=nums.length;i++)//子数组的长度
    	{
    		for(int j=0;j<nums.length-i;j++)//子数组的起点
    		{
    			if(nums[j]>nums[j+i])
    			{
    				sums=sums-nums[j]+nums[j+i];
    				for(int n=j;n<i;n++)
    					sums+=nums[n];
    			}
    			if(maxsums < sums)//子数组最大值
    			{
    				maxsums=sums;
    			}
    		}
    	}
    	return maxsums;
    }
}

//class Solution {
//    public int maxSubArray(int[] nums) {
//        int ans = nums[0];
//        int sum = 0;
//        for(int num: nums) {
//            if(sum > 0) {
//                sum += num;
//            } else {
//                sum = num;
//            }
//            ans = Math.max(ans, sum);
//        }
//        return ans;
//    }
//}

// 作者：guanpengchn
// 链接：https://leetcode-cn.com/problems/maximum-subarray/solution/hua-jie-suan-fa-53-zui-da-zi-xu-he-by-guanpengchn/
// 来源：力扣（LeetCode）
// 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
