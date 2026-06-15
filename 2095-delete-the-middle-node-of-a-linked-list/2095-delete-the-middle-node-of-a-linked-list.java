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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            head = null;
            return head;
        }

        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        int mid = len / 2;

        int i = 0;
        ListNode curr = head;
        while (curr != null) {
            if (i == mid - 1) {
                break;
            }
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;

        return head;
    }
}