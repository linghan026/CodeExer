package leetcode.inter;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author Linghan
 * @version 2021/4/24 15:59
 */
public class Inter0108 {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> zeroI = new ArrayList<>();
        ArrayList<Integer> zeroJ = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    //查找为0的位置
                    zeroI.add(i);
                    zeroJ.add(j);
                }
            }
        }
        for (Integer integer : zeroI) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[integer][j] = 0;
            }
        }
        for (Integer integer : zeroJ) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][integer] = 0;
            }
        }

    }
    public int test1(){
        int i = 0;
        try {
            System.out.println("try" + i);
            throw new Exception("123");
        } catch (Exception e) {
            return i++;
        } finally {
            System.out.println("finally" + i);
        }
    }

    @Test
    public void test() {
        int[][] nums = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(nums);
        for (int[] num : nums) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(num[j]);
            }
            System.out.println();
        }
//        test1();
    }
}
