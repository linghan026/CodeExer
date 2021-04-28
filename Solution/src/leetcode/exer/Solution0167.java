package leetcode.exer;

import org.junit.Test;

/**思路：双指针法，从两头开始加，如果大于目标，右指针往左，小了，左指针往右
 * @author Linghan
 * @version 2021/4/27 17:07
 */
public class Solution0167 {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = numbers.length - 1;
        while (index1<=index2) {
            int temp=numbers[index1] + numbers[index2];
            if ( temp== target) {
                break;
            } else if (temp > target) {
                index2--;
            } else {
                index1++;
            }
        }
        return new int[]{index1+1, index2+1};
    }
    @Test
    public void test(){
        int[] nums={-1,0};
        int[] out=twoSum(nums,-1);
        System.out.println(out[0]);
        System.out.println(out[1]);
    }
}
