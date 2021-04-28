package leetcode.exer;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author Linghan
 * @version 2021/4/27 17:33
 */
public class Solution0027 {
    public int removeElement(int[] nums, int val) {
        int slow=0;
        for (int fast = 0; fast < nums.length; fast++) {
            if(nums[fast]==val)
                continue;
            nums[slow]=nums[fast];
            slow++;
        }
        return slow;
    }
    @Test
    public void test(){
        int[] nums={3,2,1,3,6,7};
        int len=removeElement(nums,3);
        for (int i = 0; i <len ; i++) {
            System.out.println(nums[i]);
        }
    }
}
