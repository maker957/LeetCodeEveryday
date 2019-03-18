package IntersectionOfTwoLinkedList_160_3_18;

class Solution {

    /**
     * 首先通过len函数处理链表多余出的部分。
     * 然后比较headA 和 headB是否相等。
     * 相等则返回
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        int lenA = len(headA),lenB = len(headB);

        while(lenA > lenB){
            headA = headA.next;
            lenA--;
        }
        while(lenA < lenB){
            headB = headB.next;
            lenB--;
        }

        while(headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    private int len(ListNode head) {
        int len = 1;
        while(head!=null){
            head = head.next;
            len++;
        }
        return len;
   }
}