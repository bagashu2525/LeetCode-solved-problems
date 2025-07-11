package LinkedList;
/**
 * Problem: 25. Reverse Nodes in k-Group
 * LeetCode: https://leetcode.com/problems/reverse-nodes-in-k-group/
 * Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
 * k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
 * You may not alter the values in the list's nodes, only nodes themselves may be changed.
 */

public class ReverseNodeInKGroup {
    public ListNode findNode(ListNode temp,int k){
        int r=1;
        while(temp!=null){
            if(r==k) return temp;
            r++;
            temp=temp.next;
        }
        return null;
    }
    public void reverse(ListNode temp){
        ListNode curr = temp, prev =null, next;
        while(curr!=null){
            next= curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head, prevNode = null;
        while(temp!=null){
            ListNode kthNode = findNode(temp,k);
            if(kthNode == null){
                if(prevNode!=null) prevNode.next=temp;
                break;
            }
            ListNode nextNode = kthNode.next;
            //separate the linkedlist for reverse
            kthNode.next=null;
            reverse(temp);
            if(temp==head)
                head = kthNode;
            else
                prevNode.next = kthNode;
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }
    public static void main(String[] args) {
        ReverseNodeInKGroup reverse = new ReverseNodeInKGroup();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 2;
        ListNode newHead = reverse.reverseKGroup(head, k);
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
