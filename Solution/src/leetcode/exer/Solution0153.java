package leetcode.exer;

/**
 * @author Linghan
 * @version 2021/4/28 20:48
 */
public class Solution0153 {
    public int findMin(int[] nums) {
//        //法一：暴力
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] < nums[i - 1])
//                return nums[i];
//        }
//        return nums[0];
        //法二：二分法（官方）
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = (high + low) / 2;
            if (nums[pivot] < nums[high]) {
                high = pivot;
            } else {
                low = pivot + 1;
            }
        }
        return nums[low];
    }
}
