package LinkedList;
/**
 * Problem: 61. Rotate List
 * LeetCode: https://leetcode.com/problems/rotate-list/
 * Given the head of a linked list, rotate the list to the right by k places.
 */
public class RotateLL {
    public ListNode rotation(ListNode head){
        //one rotation
        ListNode temp= head, tail=null;
        while(temp.next!=null){
            tail = temp;
            temp=temp.next;
        }
        temp.next=head;
        if(tail!=null) tail.next = null;
        return temp;
        
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        int len=0;
        ListNode temp= head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        k%=len;
        while(k!=0){
            head = rotation(head);
            k--;
        }
        return head;
        
    }
    public static void main(String[] args) {
        RotateLL rotate = new RotateLL();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 2;
        ListNode newHead = rotate.rotateRight(head, k);
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
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
