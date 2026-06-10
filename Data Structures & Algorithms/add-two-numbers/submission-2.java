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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry = 0;

        ListNode finalList = new ListNode(-100);
        ListNode tempList = finalList;
        while(l1 != null && l2 != null){

            int digitTotal = (l1.val + l2.val) % 10;
            System.out.println("Total : "+digitTotal+" Carry : "+carry);
            ListNode newNode = new ListNode(digitTotal + carry);
            carry = (l1.val + l2.val) / 10;
            tempList.next = newNode;
            tempList = tempList.next;
            l1 = l1.next;
            l2 = l2.next ;
        }
        if(l1 != null){
            while(l1 != null){
                int digitTotal = (l1.val + carry) % 10;
                System.out.println("l1 : "+digitTotal+" Carry : "+carry);
                ListNode newNode = new ListNode(digitTotal);
                carry = (l1.val + carry) / 10;
                tempList.next = newNode;
                tempList = tempList.next;
                l1 = l1.next;
            }
        }
        if(l2 != null){
            while(l2 != null){
                int digitTotal = (l2.val + carry) % 10;
                System.out.println("l2 : "+digitTotal+" Carry : "+carry);
                ListNode newNode = new ListNode(digitTotal);
                carry = (l2.val + carry) / 10;
                tempList.next = newNode;
                tempList = tempList.next;
                l2 = l2.next;
            }
        }
        if(l1 == null && l2 == null && carry > 0){
            tempList.next = new ListNode(carry);
        }
        finalList = finalList.next;
        return finalList;
    }
}
