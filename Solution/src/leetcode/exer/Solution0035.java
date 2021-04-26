package leetcode.exer;

import org.junit.Test;

import java.lang.annotation.Target;

/**
 * @author Linghan
 * @version 2021/4/22 18:58
 */
public class Solution0035 {
    public int searchInsert(int[] nums, int target) {
//        //直接遍历
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]==target)
//                return i;
//            else if(nums[i]>target)
//                return i;
//        }
//        return nums.length;

        //二分查找

        int n = nums.length;
        int left=0,right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return left;

        //尝试二分查找 失败
//        if(nums == null)
//            return -1;
//        if(nums.length==1 && nums[0]==target)
//            return 0;
//        if(nums[nums.length-1]<target)
//            return nums.length;
//        else if(nums[nums.length-1]==target)
//            return nums.length-1;
//
//        int index=nums.length/2;
//        int det=nums.length/2;
//        while(det!=0){
//            det=det/2;
//            if(nums[index]==target)
//                return index;
//            else if(nums[index]>target&&nums[index-1]<target)
//                return index;
//            if(nums[index]<target&&nums[index+1]>target)
//                return index+1;
//            else if(nums[index]<target)
//                index+=det;
//            else
//                index-=det;
//        }
//        return 0;
    }
    @Test
    public void test(){
        int[] nums={1,3,5};
        int target1=4;
        int n = searchInsert(nums, target1);
        System.out.println(n);
    }
}
