package leetcode.exer;

import org.junit.Test;

/**
 * @author Linghan
 * @version 2021/4/28 13:42
 */
public class Solution0151 {
    public String reverseWords(String s) {
        int slow = s.length()-1;
        StringBuilder out=new StringBuilder();
        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i)==' ') {
                for (int j = i+1; j <=slow; j++) {
                    out.append(s.charAt(j));
                    if(j==slow)
                        out.append(" ");
                }
                slow = i - 1;
            } else if (i == 0 && s.charAt(i)!=' ') {
                for (int j = i; j <=slow; j++) {
                    out.append(s.charAt(j));
                }
            }
        }
        if(out.charAt(out.length()-1)==' ')
            out.deleteCharAt(out.length()-1);
        return out.toString();
    }
    @Test
    public void test(){
        String s="  hello world  ";
        System.out.println(reverseWords(s));
    }
}
