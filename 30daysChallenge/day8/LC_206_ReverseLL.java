//iterative approach
class LC_206_ReverseLL {

 
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;  
            curr.next = prev;           
            prev = curr;                
            curr = next;                
        }
        return prev; 
    }

    public void printList(ListNode head)
     {
        ListNode curr = head;
        while (curr != null)
         {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

 
    public static void main(String[] args) {
        LC_206_ReverseLL obj = new LC_206_ReverseLL();

    ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        obj.printList(head);

        ListNode newHead = obj.reverseList(head);

        System.out.println("Reversed List:");
        obj.printList(newHead);
    }
}







//recursive approach
/*
class Solution {
    public ListNode reverseList(ListNode head) {
       if(head==null || head.next==null){
        return head;


       }

       ListNode newhead=reverseList(head.next);
       head.next.next=head;
       head.next=null;
       return newhead;
    }
}
*/