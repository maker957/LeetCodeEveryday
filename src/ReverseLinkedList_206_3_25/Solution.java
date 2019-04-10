package ReverseLinkedList_206_3_25;

public class Solution {
    /**
     * iterative solution
     * 3 -> 4 ->5
     * 
     * 3 -> 4 ->5
     *      next
     * 
     * 3 -> newHead 4 -> 5
     * 
     * 3           4 -> 5
     * newHead
     * 
     * 4 -> 5
     *      next
     * 
     * 4 -> 3  5
     * 
     * 
     * 
     */
    public ListNode reverseList(ListNode head){
        if(head == null) return null;
        ListNode newHead = null;
        while(head !=null){
            ListNode next = head.next;   //save next
            head.next = newHead;    //reverse
            newHead = head;         //advance newHead
            head = next;            //adcance curr
        }
        return newHead;
    }
}