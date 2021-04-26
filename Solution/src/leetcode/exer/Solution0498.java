package leetcode.exer;

import org.junit.Test;

/**
 * @author Linghan
 * @version 2021/4/25 11:06
 */
public class Solution0498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m= mat.length;
        int n= mat[0].length;
        if(m==1)
            return mat[0];
        else if(n==1){
            int[] out=new int[m];
            for (int i = 0; i < m; i++) {
                out[i]=mat[i][0];
            }
            return out;
        }
        int[] out=new int[m*n];
        int cur=0;

        out[cur++]=mat[0][0];
        int a=-1;
        int b=2;
        while (!(a==m-1&&b==n-1)){
            //↙
            while (b!=0 && a!=m-1){
                a++;
                b--;
                out[cur++]=mat[a][b];
            }
            if(a==m-1) {//当前在下侧
                b++;//→
                out[cur++]=mat[a][b];
            }
            else if(b==0) {//当前在左侧
                a++;//↓
                out[cur++]=mat[a][b];
            }
            if(a==m-1&&b==n-1)
                break;
            //↗
            while (a!=0 && b!=n-1){
                a--;
                b++;
                out[cur++]=mat[a][b];
            }
            if(b==n-1)//当前在右侧
            {
                a++;//↓
                out[cur++]=mat[a][b];
            }
            else if(a==0) {//当前在上侧
                b++;//→
                out[cur++]=mat[a][b];
            }
            if(a==m-1&&b==n-1)
                break;
        }
        return out;
    }
    @Test
    public void test(){
        int[][] nums = {{1},{2},{3}};
        int[] out=findDiagonalOrder(nums);
        for (int j : out) {
            System.out.print(j);

        }
    }
}
