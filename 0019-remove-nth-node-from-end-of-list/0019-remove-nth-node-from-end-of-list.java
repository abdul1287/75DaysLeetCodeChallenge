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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n < 1) {
            return null;
        }
        if (n == 1) {
            ListNode rev = reverse(head);
            rev = rev.next;
            return reverse(rev);
        }

        ListNode point = head;
        int length = 0;
        while (point != null) {
            length++;
            point = point.next;
        }

        if (length == n) {
            head = head.next;
            return head;
        }

        ListNode rev = reverse(head);

        ListNode temp = rev;
        int count = 1;
        while (temp.next != null) {
            if (count == n - 1) {
                break;
            }
            count++;
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return reverse(rev);
    }

    ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}