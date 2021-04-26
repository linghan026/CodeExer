package leetcode.exer;

import Code.Util.ListNode;
import org.junit.Test;

/**
 * 25. K 个一组翻转链表
 * 参考：
 * https://labuladong.gitee.io/algo/高频面试系列/k个一组反转链表.html
 * @author Linghan 2021/4/16 16:06
 */
public class Solution0025ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null)
            return null;

        ListNode a, b;// 区间 [a, b) 包含 k 个待反转元素
        a = b = head;
        for (int i = 0; i < k; i++) {//计算剩余长度 不足即停止
            if (b == null)
                return head;
            b = b.next;
        }


        ListNode newHead = reverse(a, b);//反转K个链表段，接上剩余部分

        a.next = reverseKGroup(b, k);  // 递归反转后续链表并连接起来

        return newHead;

    }

    /**
     * 反转区间 [a, b) 的元素，注意是左闭右开
     */
    ListNode reverse(ListNode a, ListNode b) {
        ListNode pre, cur, nxt;
        pre = null; cur = a;
        // while 终止的条件改一下就行了
        while (cur != b) {
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        // 返回反转后的头结点
        return pre;
    }

    @Test
    public void test(){

    }
}
