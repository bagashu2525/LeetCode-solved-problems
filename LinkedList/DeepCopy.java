package LinkedList;

import java.util.HashMap;
/**
 * Problem: 138. Copy List with Random Pointer
 * LeetCode: https://leetcode.com/problems/copy-list-with-random-pointer/
 * A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
 * Return a deep copy of the list.
 */
public class DeepCopy {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> mp = new HashMap<>();
        Node temp = head;
        //copying the node values
        while(temp!=null){
            Node newNode = new Node(temp.val);
            mp.put(temp,newNode); 
            temp=temp.next;
        }
        //copying the next and random
        temp=head;
        while(temp!=null){
            Node copyNode = mp.get(temp);
            copyNode.next = mp.get(temp.next);
            copyNode.random = mp.get(temp.random);
            temp=temp.next;
        }
        return mp.get(head);
    }
    public static void main(String[] args) {
        // Example usage
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        node1.random = node3; // 1's random points to 3
        node2.random = null;  // 2's random points to null
        node3.random = node1; // 3's random points to 1

        DeepCopy solution = new DeepCopy();
        Node copiedHead = solution.copyRandomList(node1);

        // Print the copied list
        Node current = copiedHead;
        while (current != null) {
            System.out.print("Value: " + current.val);
            if (current.random != null) {
                System.out.print(", Random Value: " + current.random.val);
            } else {
                System.out.print(", Random Value: null");
            }
            System.out.println();
            current = current.next;
        }
    }
}
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
