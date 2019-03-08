package RemoveDuplicatesFromSrotedList_83_3_8;

/**
 * @Author: mxl
 * @Date: 2019/3/8 16:17
 * @Version 1.0
 */



class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}


public class Solution {


    /**
     *
     * @param head
     * @return ListNode
     *
     * 采用递归思想，不是很懂。
     *
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;

    }
}
