package leetcode.exer;

import org.junit.Test;
import java.util.Arrays;


/**瞬间就想到了排序后隔位取值，没想到官方题解就是这个。不过为什么那么费时不太清楚
 * @author Linghan
 * @version 2021/4/27 16:41
 */
public class Solution0561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for (int i = 0; i < nums.length; i=i+2) {
            sum+= nums[i];
        }
        return sum;
    }
    @Test
    public void test(){
        int[] nums={6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }
}
