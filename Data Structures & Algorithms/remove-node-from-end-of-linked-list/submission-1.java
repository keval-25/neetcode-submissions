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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        temp = head;
        n = cnt - n;
        cnt = 1;
        if(n == 0) return head.next;
        while(cnt <=  n){

            if(cnt == n){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            cnt++;
        }

        return head;
    }
}
