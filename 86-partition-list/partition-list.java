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
    public ListNode partition(ListNode head, int x) {
        ListNode i = new ListNode(-1);
        ListNode j = new ListNode(-1);
        ListNode temp1 = i;
        ListNode temp2 = j;
        ListNode t = head;
        while(t!=null){
            if(t.val < x){
                temp1.next = t;
                temp1 = temp1.next;
            }
            else{
                temp2.next = t;
                temp2 = temp2.next;
            }
            t = t.next;
        }
        temp1.next = j.next;
        temp2.next = null;
        return i.next;
    }
}