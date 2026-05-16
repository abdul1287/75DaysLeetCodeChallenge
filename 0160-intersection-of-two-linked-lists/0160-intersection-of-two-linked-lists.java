/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        ListNode ans = null;

        while (temp1 != null || temp2 != null) {
            if (temp1 == temp2) {
                ans = temp1;
                return ans;
            } else if (temp1 == null) {
                temp1 = headB;
            } else if (temp2 == null) {
                temp2 = headA;
            } else {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }

        return ans;
    }
}