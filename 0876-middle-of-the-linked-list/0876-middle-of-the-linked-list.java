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

        ListNode sptr = head;
        ListNode fptr = head.next;

        while(fptr != null) {
            sptr = sptr.next;
            if(fptr.next != null)   {
                fptr = fptr.next.next;
            }   else {
                return sptr;
            }
        }

        return sptr;
    }
}