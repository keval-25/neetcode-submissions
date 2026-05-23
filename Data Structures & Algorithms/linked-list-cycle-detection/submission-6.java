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
    public boolean hasCycle(ListNode head) {
        
        //My solution
        /*
        if(head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next.next;

        while(fast != null){
            if(fast == slow){
                return true;
            }
            slow = slow.next;
            if(fast.next == null) return false;
            fast = fast.next.next;
        }
        return false;
        */

        //Better approach, solution is same just initialization is changed
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
