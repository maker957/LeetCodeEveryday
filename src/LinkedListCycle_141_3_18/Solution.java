package LinkedListCycle_141_3_18;

/**
 * @Author: mxl
 * @Date: 2019/3/18 17:10
 * @Version 1.0
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head;

        while (p != null && q != null && p.next != null) {//边界条件，出现空指针就返回false
            q = q.next;
            p = p.next.next; //空指针没有next,否则会出现空指针异常
            if (p == q) {
                return true;
            }
        }
        return false;
    }
}
