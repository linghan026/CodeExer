package leetcode.exer;

import org.junit.Test;

/**
 * @author Linghan
 * @version 2021/4/26 20:01
 */
public class Solution0344 {
    public void reverseString(char[] s) {
        if(s.length==0){
            return;
        }
        char temp;
        for (int i = 0,j=s.length-1; i <j; i++,j--) {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
    @Test
    public void test(){
        char[] s={'h','e','l','l','o'};

        reverseString(s);
        for (char c : s) {
            System.out.println(c);
        }
    }
}
