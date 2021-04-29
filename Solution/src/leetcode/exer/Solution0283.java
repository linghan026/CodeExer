package leetcode.exer;

import org.junit.Test;

/**
 * @author Linghan
 * @version 2021/4/29 20:15
 */
public class Solution0283 {
    public void moveZeroes(int[] nums) {
        int slow=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[slow++]=nums[i];
            }
        }
        for (int i = slow; i <nums.length; i++) {
            nums[i]=0;
        }
    }
    @Test
    public void test(){
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
    }
}
