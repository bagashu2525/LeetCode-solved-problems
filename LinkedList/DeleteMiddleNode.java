package LinkedList;

/*
 * You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.

For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
 */
public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        ListNode nodeslow=head;
        ListNode nodefast=head;
        ListNode prev=head;
        if(head.next==null) return null;
        while(nodeslow!=null && nodefast.next!=null){
            prev=nodeslow;
            nodeslow=nodeslow.next;
            if(nodefast.next.next==null) break;
            nodefast=nodefast.next.next;
        }
        prev.next=nodeslow.next;
        return head;

    }
    public static void main(String[] args) {
        DeleteMiddleNode solution = new DeleteMiddleNode();

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Delete the middle node
        ListNode newHead = solution.deleteMiddle(head);

        // Print the modified linked list
        ListNode current = newHead;
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
