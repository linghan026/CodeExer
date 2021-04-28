package leetcode.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Linghan
 * @version 2021/4/28 19:42
 */
public class Solution0119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> out = new ArrayList<>();
        List<Integer> curlayer0= new ArrayList<>();
        curlayer0.add(1);
        out.add(curlayer0);
        if(rowIndex==0)
            return curlayer0;
        List<Integer> curlayer1= new ArrayList<>();
        curlayer1.add(1);
        curlayer1.add(1);
        out.add(curlayer1);
        if(rowIndex==1)
            return curlayer1;
        for (int i = 2; i <=rowIndex; i++) {
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
        return out.get(rowIndex);
    }
    @Test
    public void test(){
        getRow(3);
    }
}
