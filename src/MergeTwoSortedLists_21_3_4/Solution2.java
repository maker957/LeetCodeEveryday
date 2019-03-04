package MergeTwoSortedLists_21_3_4;

public class Solution2 {
    public ListNode mergeTwoLists2(ListNode l1,ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = new ListNode(l1.val);
                l1=l1.next;
            } else {
                cur.next = new ListNode(l2.val);
                l2=l2.next;
            }
            cur = cur.next;
        }
        if (l1 != null) {
            cur.next = l1;
        } else {
            cur.next = l2;
        }
        return dummy.next;
    }
}
