package LinkedList;

/*
Problem 2487:
You are given the head of a linked list.

Remove every node which has a node with a greater value anywhere to the right side of it.

Return the head of the modified linked list.
*/
/**
 * Definition for singly-linked list.*/


public class RemoveNodes {
    public void func(ListNode node,ListNode newnode){
        if(node.next!=null && node.next.next!=null)
            func(node.next,node.next.next);
        //removing the nodes according to the question
        if(node!=null && newnode!=null && node.val<newnode.val){
            node.val = newnode.val;
            node.next = newnode.next;
        }
    }
    public ListNode removeNodes(ListNode head) {
        if (head==null) return null;
        ListNode node = head;                  
        func(node,node.next);        
        return head;
    }
    public static void main(String[] args) {
        // Example usage
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(13);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(8);
        
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        RemoveNodes solution = new RemoveNodes();
        ListNode modifiedHead = solution.removeNodes(node1);

        // Print the modified list
        ListNode current = modifiedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}