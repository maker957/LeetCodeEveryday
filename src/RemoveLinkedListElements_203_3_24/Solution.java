package RemoveLinkedListElements_203_3_24;

/**
 * 移除链表重复元素
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val){
        if(head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    public ListNode removeElements1(ListNode head,int val){
        ListNode fakeHead = new ListNode(-1);
        
        fakeHead.next = head;

        ListNode curr = head, prev = fakeHead;

        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
            }
            else{
                prev = prev.next;
            }
            curr = curr.next;
        }
        return fakeHead.next;
    }

}