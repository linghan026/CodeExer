package leetcode.exer;

import org.junit.Test;

/**
 * @author Linghan
 * @version 2021/4/28 20:00
 */
public class Solution0557 {
    public String reverseWords(String s) {
        int slow = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                for (int j = slow; j < (i + slow) / 2; j++) {
                    char temp = chars[j];
                    chars[j] = chars[i + slow - j - 1];
                    chars[i + slow - j - 1] = temp;
                }
                slow = i + 1;
            }
        }
        for (int j = slow; j < (chars.length + slow) / 2; j++) {
            char temp = chars[j];
            chars[j] = chars[chars.length + slow - j - 1];
            chars[chars.length + slow - j - 1] = temp;
        }
        return String.copyValueOf(chars);
    }
    @Test
    public void test(){
        String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
