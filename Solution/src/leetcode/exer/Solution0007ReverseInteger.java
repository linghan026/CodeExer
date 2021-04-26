package leetcode.exer;

/**
 * 7. 整数反转
 * @author Linghan 2021/4/12 16:31
 */
public class Solution0007ReverseInteger {
    public int reverse(int x) {
        long n=0;
        // try{
        //     while(x!=0){
        //         n=n*10+x%10;
        //         x=x/10;
        //     }
        // }catch(Exception e){
        //     return 0;
        // }
        while(x != 0){
            n=n*10+x%10;
            x=x/10;
        }
        return (int)n==n? (int)n:0;//java int溢出后变负数，没有异常


        //转字符串2021年4月12日 Linghan
        // String str=String.valueOf(x);
        // String str1="";
        // int num;
        // if(str.charAt(0)=='-'){
        //     str1+="-";
        //     for(int i=str.length()-1;i>0;i--){
        //          str1+=str.charAt(i);
        //     }
        // }
        // else{
        //     for(int i=str.length()-1;i>=0;i--){
        //          str1+=str.charAt(i);
        //     }
        // }
        // //溢出判断1
        // try{
        //     num = Integer.parseInt(str1);
        // }catch(Exception e){
        //     return 0;
        // }
        // return num;

        //溢出判断2
        // long num= Long.valueOf(str1);
        // //-231 <= x <= 231 - 1
        // if(num>2147483647 || num < -2147483648)
        //     num=0;
        // int nums=(int)num;
        // return nums;
    }
}
