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

    //This is my own solution
    // public ListNode removeNthFromEnd(ListNode head, int n) {

    //     ListNode temp = head;
    //     int cnt = 0;
    //     while(temp != null){
    //         cnt++;
    //         temp = temp.next;
    //     }
    //     temp = head;
    //     n = cnt - n;
    //     cnt = 1;
    //     if(n == 0) return head.next;
    //     while(cnt <=  n){

    //         if(cnt == n){
    //             temp.next = temp.next.next;
    //             break;
    //         }
    //         temp = temp.next;
    //         cnt++;
    //     }

    //     return head;
    // }

//This is optimal solution
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode fast = dummy;
    ListNode slow = dummy;

    for(int i = 0; i <= n; i++) {
        fast = fast.next;
    }

    while(fast != null) {
        fast = fast.next;
        slow = slow.next;
    }

    slow.next = slow.next.next;

    return dummy.next;
}
}
