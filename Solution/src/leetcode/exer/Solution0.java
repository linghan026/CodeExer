package leetcode.exer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Linghan
 * @version 2021/4/29 20:46
 */
public class Solution0 {
    public int[][] merge(int[][] intervals) {
//        List<List<Integer>> out= new ArrayList<>();
//        List<Integer> cur= Arrays.asList();
//        List<Integer> nxt=new ArrayList<>();

        //将区间看成一个元素处理
        if(cur.get(0)>= nxt.get(1)){
            //将前一个区间的左端点和后一个区间的右端点组成一个区间 添加到输出中
            //然后新区间作为前一个区间，后区间指向下一个
        }
        else{
            //直接将前一个区间添加到输出中
            //然后将后一个区间作为前一个区间，后区间指向下一个
        }
    }
}
