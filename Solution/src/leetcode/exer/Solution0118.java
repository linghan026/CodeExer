package leetcode.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Linghan
 * @version 2021/4/28 14:09
 */
public class Solution0118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> out = new ArrayList<>();
        if(numRows==0)
            return out;
        List<Integer> curlayer0= new ArrayList<>();
        curlayer0.add(1);
        out.add(curlayer0);
        if(numRows==1)
            return out;
        List<Integer> curlayer1= new ArrayList<>();
        curlayer1.add(1);
        curlayer1.add(1);
        out.add(curlayer1);
        if(numRows==2)
            return out;
        for (int i = 2; i <numRows; i++) {
            List<Integer> curlayer= new ArrayList<>();
            curlayer.add(1);
            for (int j = 1; j <= i/2; j++) {
                curlayer.add(out.get(i-1).get(j-1)+out.get(i-1).get(j));
            }
            for (int j =i/2+1; j <=i; j++) {
                curlayer.add(curlayer.get(i-j));
            }
            out.add(curlayer);
        }
        return out;
    }
    @Test
    public void test(){
        List<List<Integer>> out =generate(5);
    }
}
