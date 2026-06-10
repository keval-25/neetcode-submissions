/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        Map<Node, Node> nodeMap = new HashMap<>();

        Node temp = head;

        Node newList = new Node(0);
        Node newTemp = newList;
        while(temp != null){

            Node nd = new Node(temp.val);
            nodeMap.put(temp,nd);
            newTemp.next = nd;
            newTemp = newTemp.next;
            temp = temp.next;
        }

        newList = newList.next;
        newTemp = newList;
        temp = head;
        while(temp != null){

            if(temp.random == null){
                newTemp.random = null;
            }
            else{
                newTemp.random = nodeMap.get(temp.random);
            }
            temp = temp.next;
            newTemp = newTemp.next;
        }

        return newList;
    }
}
