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
    public ListNode middleNode(ListNode head) {

        // Approach 1 : Two passes needed
        // ListNode temp = head;

        // int count = 0;
        // while(temp != null) {
        //     temp = temp.next;
        //     count++;
        // }
        // int mid = count / 2;
        // temp = head;
        // int point = 0;
        // while(temp != null) {
        //    if(point == mid) {
        //        head = temp;
        //        break;
        //    }
        //    temp = temp.next;
        //    point++;
        // }

        // return head;

        // Approach 2 : only one pass needed
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}