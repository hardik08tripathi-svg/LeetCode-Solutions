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
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) return null;

        ListNode a = new ListNode(-1);
        ListNode x = a;
        ListNode temp = head;

        a.next = head;

        while (temp != null) {
            if (temp.val == val) {
                x.next = temp.next;
                temp = temp.next;
            } else {
                x = temp;
                temp = temp.next;
            }
        }

        return a.next;
    }
}