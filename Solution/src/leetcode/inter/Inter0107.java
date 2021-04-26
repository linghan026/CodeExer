package leetcode.inter;

/**
 * @author Linghan
 * @version 2021/4/23 19:18
 */
public class Inter0107 {
    public void rotate(int[][] matrix) {
        //法一
        int len=matrix.length;
        int[][] out=new int[len][len];
        for (int j=0;j<len;j++) {
            int k=0;
            for (int i = len-1; i >=0; i--) {
                out[j][k]=matrix[i][j];
                k++;
            }
        }
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len; ++j) {
                matrix[i][j] = out[i][j];
            }
        }

    }
}
