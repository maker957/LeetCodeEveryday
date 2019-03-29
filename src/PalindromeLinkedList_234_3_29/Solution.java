package PalindromeLinkedList_234_3_29;



public class Solution {
    public boolean isPalindrome(ListNode head){
        //移动slow和next
        ListNode fast = head, slow = head;
        while(fast != null &&  fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        //奇数个节点
        if(fast != null){
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;

        while(slow != null){
            if(fast.val != slow.val){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
        
    }
}