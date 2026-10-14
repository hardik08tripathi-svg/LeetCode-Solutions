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
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head1 = slow.next;
        slow.next = null;
        head1 = reverse(head1);
        ListNode i = head;
        ListNode j = head1;
        while(j!=null){
            if(i.val!=j.val) return false;
            else{
                i = i.next;
                j = j.next;
            }
        }
        return true;
    }
}