package LinkedList;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveElement {
    public static ListNode removeElements2(ListNode head, int val) {
        if(head==null) return head;
        ListNode headnew = new ListNode();
        headnew.next = head;
        ListNode prev = headnew;
        ListNode node = headnew;
        while(node!=null){
            if(node.val==val){
                prev.next = node.next;
            }
            else 
            {
                prev = node;
                
            }    
            node=node.next;
        }
        return headnew.next; // Return the modified list, skipping the dummy node
    }
public static ListNode removeElements(ListNode head, int val) {
       ListNode headnew=null;
       ListNode headcopy=head;
       while(headcopy!=null){
        if(headcopy.val != val) {
            ListNode node = new ListNode(headcopy.val);
            if(headnew!=null){
                
                ListNode temp=headnew;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=node;
                
            }
            else{
                
                headnew = node;
                
            } 
            
                
            
            
        }
        headcopy=headcopy.next;
       } 
       return headnew;
    }
    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int valToRemove = 6;
        ListNode modifiedList = removeElements(head, valToRemove);

        // Print the modified list
        ListNode current = modifiedList;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
        valToRemove = 6;
        modifiedList = removeElements2(head, valToRemove);
        // Print the modified list
        current = modifiedList;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
