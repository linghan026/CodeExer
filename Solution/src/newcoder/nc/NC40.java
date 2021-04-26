package newcoder.nc;

import Code.Util.ListNode;
import org.junit.Test;

/**
 * NC40	链表相加
 * 从LeetCode 2. 两数相加 和 206. 反转链表 拷贝过来。
 * @author Linghan 2021/4/15 9:15
 */


public class NC40 {
    /**
     *
     * @param head1 ListNode类
     * @param head2 ListNode类
     * @return ListNode类
     */
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        head1=reverseList(head1);
        head2=reverseList(head2);

        ListNode  l1_1=head1;
        ListNode  l2_1=head2;
        ListNode sum=new ListNode(0);
        sum.val=0;
        ListNode sum1=new ListNode(0);
        sum1.val=0;
        sum1.next=sum;

        int add1=0;//进位标志
        int sum_sigle;
        while(l1_1!= null && l2_1 != null){
            sum_sigle=l1_1.val + l2_1.val+add1;//当前位相加,并加上进位
            if(sum_sigle>9){
                add1=1;
                sum_sigle=sum_sigle-10;
            }
            else{
                add1=0;
            }
            sum.next=new  ListNode(0);//和的当前位
            sum=sum.next;
            sum.val=sum_sigle;
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
            sum.next=new  ListNode(0);//和的当前位
            sum=sum.next;
            sum.val=sum_sigle;
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
            sum.next=new  ListNode(0);//和的当前位
            sum=sum.next;
            sum.val=sum_sigle;
            l1_1=l1_1.next;
        }
        if(add1==1){
            sum.next=new  ListNode(0);//和的当前位
            sum.next.val=1;
        }
        return reverseList(sum1.next.next);
    }

    //迭代法反转链表
    public ListNode reverseList(ListNode head) {
        ListNode pre, cur, nxt;
        pre = null;
        cur = head;
        while (cur != null) {
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
    @Test
    public void test(){

    }
}