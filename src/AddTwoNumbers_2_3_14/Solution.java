package AddTwoNumbers_2_3_14;

import java.util.List;

/**
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 *
 * @Author: mxl
 * @Date: 2019/3/14 18:35
 * @Version 1.0
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        int sum = 0;
        ListNode cur = dummy;
        ListNode p1 = l1, p2 = l2;
        while (p1 != null || p2 != null) {
            if (p1 != null) {
                sum+=p1.val;
                p1=p1.next;
            }
            if (p2 != null) {
                sum+=p2.val;
                p2=p2.next;
            }
            cur.next = new ListNode(sum % 10);  //cur.next即为去掉进位后的值
            sum/=10;  //求出进位 加到下一轮的计算中
            cur=cur.next;  //cur指向下一个元素
        }
        if (sum == 1) {//解决最高位进位问题
            cur.next = new ListNode(1);
        }
        return dummy.next;
    }
}
