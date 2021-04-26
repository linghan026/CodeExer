package newcoder.nc;

import org.junit.Test;

/**
 * NC151	最大公约数
 * @author Linghan 2021/4/15 8:42
 */
public class NC151 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 求出a、b的最大公约数。
     * @param a int
     * @param b int
     * @return int
     */
    public  int gcd2(int a, int b){//更相减损术
        while(a != b){
            if(a > b) a -= b;
            else b -= a;
        }
        return a;
    }
    public int gcd (int a, int b) {
        // write code here
        int big, sma;
        if (a == b) {
            return a;
        } else if (a > b){
            big=a;
            sma=b;
        }
        else {
            big=b;
            sma=a;
        }

        if(big%sma == 0) {
            return sma;
        } else{
            for(int i=sma-1;i>1;i--){
                if(big%i == 0 && sma%i == 0)
                    return i;
            }
        }
        return 1;
    }
    @Test
    public void test(){
        System.out.println(gcd(12,8));
        System.out.println(gcd2(12,8));
    }
}
