package leetcode.exer;

/**
 * @author Linghan
 * @version 2021/4/22 18:31
 */
public class Solution0724 {
    public int pivotIndex(int[] nums) {
        int sum2=0;
        for (int num : nums) {
            sum2 += num;
        }
        sum2-=nums[0];
        int sum1=0;
        int CurIndex=0;

        for (int i = 0; i < nums.length-1; i++) {
            if(sum1 == sum2)
                return CurIndex;
            sum1+=nums[CurIndex];
            CurIndex++;
            sum2-=nums[CurIndex];
        }
        if(sum1 == sum2)
            return CurIndex;
        else
            return -1;
    }
}
