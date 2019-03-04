package MergeTwoSortedLists_21_3_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }


        ListNode mergehead;
        if (l1.val < l2.val) {
            mergehead = l1;
            mergehead.next = mergeTwoLists(l1.next, l2);
        } else {
            mergehead=l2;
            mergehead.next = mergeTwoLists(l1, l2.next);
        }
        return mergehead;
    }
}
