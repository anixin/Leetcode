/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null || head.next == null) return false;
        if(head.next == head) return true;

        ListNode slowPtr = head;
        ListNode fastPtr = head.next;

        while(fastPtr != null) {
            if(slowPtr == fastPtr) return true;
            slowPtr = slowPtr.next;

            if(fastPtr.next == null){
                return false;
            }   
            else {
                fastPtr = fastPtr.next.next;
            }
        }

        return false;
    }
}