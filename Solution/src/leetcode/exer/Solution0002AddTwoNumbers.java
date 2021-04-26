package leetcode.exer;

import Code.Util.ListNode;

/**
 * 2. 两数相加
 * @author Linghan 2021/4/12 16:28
 */

/*
 写得像屎一样，不过结果还不错
 执行结果：通过
 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：38.3 MB, 在所有 Java 提交中击败了99.02%的用户
 一开始理解错了，以为输入的链表是从高位到地位，还特意反转了链表。。。
*/

public class Solution0002AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //    ListNode  l1_1=reverseList(l1);
        //    ListNode  l2_1=reverseList(l2);
        ListNode  l1_1=l1;
        ListNode  l2_1=l2;
        ListNode sum=new ListNode(0);
        ListNode sum1=new ListNode(0,sum);
        int add1=0;//进位标志
        int sum_sigle=0;
        while(l1_1!= null && l2_1 != null){
            sum_sigle=l1_1.val + l2_1.val+add1;//当前位相加,并加上进位
            if(sum_sigle>9){
                add1=1;
                sum_sigle=sum_sigle-10;
            }
            else{
                add1=0;
            }
            sum.next=new  ListNode(sum_sigle);//和的当前位
            sum=sum.next;
            l1_1=l1_1.next;
            l2_1=l2_1.next;
        }
        while(l1_1== null && l2_1!= null){
            sum_sigle=l2_1.val+add1;//当前位相加,并加上进位
            if(sum_sigle>9){
                add1=1;
                sum_sigle=sum_sigle-10;
            }
            else{
                add1=0;
            }
            sum.next=new ListNode(sum_sigle);//和的当前位
            sum=sum.next;
            l2_1=l2_1.next;
        }
        while(l1_1!= null && l2_1== null){
            sum_sigle=l1_1.val+add1;//当前位相加,并加上进位
            if(sum_sigle>9){
                add1=1;
                sum_sigle=sum_sigle-10;
            }
            else{
                add1=0;
            }
            sum.next=new  ListNode(sum_sigle);//和的当前位
            sum=sum.next;
            l1_1=l1_1.next;
        }
        if(add1==1){
            sum.next=new  ListNode(1);//和的当前位
        }
        return sum1.next.next;
    }
}