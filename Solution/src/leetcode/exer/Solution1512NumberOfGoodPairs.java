package leetcode.exer;
/**
 * 
 * @Description #1512
 * @author YinLinghan 1457851494@qq.com
 * @version
 * @date 2021年1月9日下午4:32:45
 *
 */
public class Solution1512NumberOfGoodPairs
{
    public int numIdenticalPairs(int[] nums) 
    {
    	int n=0;//好数对计数
    	for(int i=0;i<nums.length;i++) 
    	{
    		for(int j=i+1;j<nums.length;j++)
    		{
    			if(nums[i] == nums[j])
    			{
    				n=n+1;
    			}
    		}
    	}
    	return n;
    }
}

//class Solution {
//    public int numIdenticalPairs(int[] nums) {
//        int ans = 0;
//        //因为 1<= nums[i] <= 100  所以申请大小为100的数组
//        //temp用来记录num的个数
//        int[] temp = new int[100];
//        /*
//        从前面开始遍历nums
//        假设nums = [1,1,1,1]
//        第一遍
//        temp是[0,0,0,0]
//        ans+=0;
//        temp[0]++;
//        第二遍
//        temp是[1,0,0,0]
//        ans+=1;
//        temp[0]++;
//        第三遍
//        temp=[2,0,0,0]
//        ans+=2;
//        temp[0]++;
//        第四遍
//        temp=[3,0,0,0]
//        ans+=3;
//        temp[0]++;
//        */
//        for (int num : nums) {
//            /*
//            这行代码可以写成
//            ans+=temp[num - 1];
//            temp[num - 1]++;
//            */
//            ans += temp[num - 1]++;
//        }
//        return ans;
//    }
//}

// 作者：JayceonDu
// 链接：https://leetcode-cn.com/problems/number-of-good-pairs/solution/zhe-gu-ji-shi-wo-xie-zen-yao-duo-ti-yi-lai-zui-dua/
// 来源：力扣（LeetCode）
// 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。