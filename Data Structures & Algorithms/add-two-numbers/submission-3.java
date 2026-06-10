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

    //This is my solution
    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
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
    */

    //This is optimized solution which is better in logic and code writing styling, this is not more improved in terms of time or space complexity as my code is already optimal in that context
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode finalList = new ListNode(-1);
        ListNode current = finalList;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){

            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            current.next = new ListNode(sum % 10);
            carry = sum / 10;
            current = current.next;
        }

        return finalList.next;
    }
}
