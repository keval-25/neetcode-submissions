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
    public void reorderList(ListNode head) {
        
        ListNode slow = head;
        ListNode temp = null;
        ListNode fast = head;

        if(head == null || head.next == null) return;

        while(fast != null && fast.next != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newTemp = temp.next;
        temp.next = null;

        newTemp = reverseList(newTemp);

        temp = head;

        while(temp.next != null){
            ListNode tp = temp.next;
            temp.next = newTemp;
            newTemp = newTemp.next;
            temp.next.next = tp;
            temp = tp;
        }

        if(newTemp != null){
            temp.next = newTemp;
        }
        System.out.println(head.val);
    }

    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null) return head;

        ListNode temp = head;
        head = head.next;
        ListNode x = reverseList(head);
        temp.next = null;
        head.next = temp;
        return x;
    }
}
