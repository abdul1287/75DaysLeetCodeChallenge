/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return list1;
        }

        ListNode dummy = new ListNode(-1);

        ListNode ptr = dummy;
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                ptr.next = temp1;
                temp1 = temp1.next;
            } else {
                ptr.next = temp2;
                temp2 = temp2.next;
            }
            ptr = ptr.next;
        }

        while (temp1 != null) {
            ptr.next = temp1;
            temp1 = temp1.next;
            ptr = ptr.next;
        }
        while (temp2 != null) {
            ptr.next = temp2;
            temp2 = temp2.next;
            ptr = ptr.next;
        }

        return dummy.next;
    }
}