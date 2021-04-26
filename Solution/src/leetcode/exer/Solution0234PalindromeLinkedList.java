package leetcode.exer;

import Code.Util.ListNode;

import java.util.ArrayList;

/**
 * 234. 回文链表
 * @author Linghan
 * @version 2021/4/16 17:09
 */

public class Solution0234PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode a=head;
        ArrayList<Integer> nums= new ArrayList<>();
        while(a!=null){
            nums.add(a.val);
            a=a.next;
        }
        for (int i = 0, j=nums.size()-1; i < nums.size()/2; i++,j--) {
            if(!nums.get(i).equals(nums.get(j)))
                return false;
        }
        return true;
    }

}
