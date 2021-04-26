package newcoder.nc;

import org.junit.Test;

import java.util.ArrayList;

/**
 * https://www.nowcoder.com/
 * NC38	螺旋矩阵
 * @author Linghan 2021/4/14 18:53
 */
public class NC38 {
    @Test
    public void test(){
        /**
         * []
         * [[1]]
         * [[2,3]]
         * [[3],[2]]
         * [[6,9,7]]
         * [[7],[9],[6]]
         * [[1,2],[3,4]]
         * [[2,5],[8,4],[0,-1]]
         * [[2,5,8],[4,0,-1]]
         * [[1,2,3],[4,5,6],[7,8,9]]
         * [[1,2,3,4,5,6,7,8,9,10]]
         * [[1],[2],[3],[4],[5],[6],[7],[8],[9],[10]]
         * [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]
         * [[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20],[21,22,23,24,25]]
         * [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
         * [[2,3,4],[5,6,7],[8,9,10],[11,12,13]]
         * [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16],[17,18,19,20]]
         * [[1,2,3,4,5,6],[7,8,9,10,11,12],[13,14,15,16,17,18],[19,20,21,22,23,24],[25,26,27,28,29,30]]
         * [[1,2,3,4,5,6,7,8,9,10],[11,12,13,14,15,16,17,18,19,20]]
         * [[1,11],[2,12],[3,13],[4,14],[5,15],[6,16],[7,17],[8,18],[9,19],[10,20]]
         */

        int[][] matrix= {{1,2,3,4}, {5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));
        int[][] matrix2= {{1,2,3}, {5,6,7},{9,10,11}};
        System.out.println(spiralOrder(matrix2));
        int[][] matrix3= {{1,2,3,4,5,6}};
        System.out.println(spiralOrder(matrix3));
    }

    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> out = new ArrayList<Integer>();
        if(matrix.length == 0){
            return out;
        }

        int i=-1;
        int j=-1;
        int count=-1;

        int right=matrix[0].length;
        int down=matrix.length;
        int left=0;
        int up=1;
        int len=right*down-1;

        while(true){
            for(i++,j++;j<right;j++){
                count++;
                out.add(count,matrix[i][j]);
            }
            if(count==len) {
                break;
            }
            for(i++,j--;i<down;i++){
                count++;
                out.add(count,matrix[i][j]);
            }
            if(count==len) {
                break;
            }
            for(i--,j--;j>=left;j--){
                count++;
                out.add(count,matrix[i][j]);
            }
            if(count==len) {
                break;
            }
            for(i--,j++;i>=up;i--){
                count++;
                out.add(count,matrix[i][j]);
            }
            if(count==len) {
                break;
            }
            right--;
            down--;
            left++;
            up++;
        }
        return out;
    }
}
