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
    public ListNode oddEvenList(ListNode head) {
        ListNode slow = new ListNode(-1);
        ListNode fast = new ListNode(-1);
        ListNode i = slow;
        ListNode j = fast;
        ListNode temp = head;
        while(temp!=null){
           i.next = temp;
           temp = temp.next;
           i = i.next;
           j.next = temp;
           if(temp!=null) temp = temp.next;
           j = j.next;
        }
        i.next = fast.next;
        return slow.next;
    }
}