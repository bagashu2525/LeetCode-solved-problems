package LinkedList;


//Problem 2 of leetcode

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode();
        ListNode l=l3;
        int carry=0;
        while (l1!=null || l2!=null || carry!=0) {
            int sum=carry;
           //You need to check if l1 or l2 is null before accessing .val. 
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            ListNode new1 = new ListNode(sum%10);
            l.next=new1;
            l=l.next;
        }
        
        return l3.next;
    }

    public static void main(String[] args) {

        // creating
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(0);
        ListNode node6 = new ListNode(3);
        node4.next = node5;
        node5.next = node6;

        // traversing
        ListNode current = node1;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

        // numbering
        current = node1;
        int m = 0, i = 1;
        while (current != null) {
            m = m + current.val * i;
            i *= 10;
            current = current.next;
        }
        System.out.println(m);

        // creating node in while loop

        // int r= m%10;
        // m=m/10;
        ListNode l3 = null;
        ListNode l = null;
        while (m > 0) {
            int r = m % 10;
            m = m / 10;
            ListNode new1 = new ListNode(r);
            if (l == null) {
                l = new1;
                l3 = l;
            }
            l.next = new1;
            l = l.next;
        }


        ListNode li = addTwoNumbers(node1, node4);

        current = li;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

    }
}
