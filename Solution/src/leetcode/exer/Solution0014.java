package leetcode.exer;

import org.junit.Test;

/**
 * @author Linghan
 * @version 2021/4/25 14:15
 */
public class Solution0014 {
    public String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if(strs[j].length() == i ||strs[0].charAt(i)!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
    @Test
    public void test(){
        String[] strs= {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
