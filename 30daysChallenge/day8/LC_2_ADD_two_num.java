


class LC_2_ADD_two_num {

    // Node definition
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyhead = new ListNode(0);  
        ListNode curr = dummyhead;           
        int carry = 0;                     

    while (l1!=null||l2!=null||carry!=0) 
        {
            int sum=carry;

            if (l1!=null)
             {
                sum=sum+ l1.val;
                l1=l1.next;
            }

            if (l2!=null)
             {
                sum+=l2.val;
                l2=l2.next;
            }

            carry=sum/10;                     
            curr.next = new ListNode(sum % 10);   
            curr =curr.next;                  
        }

     return dummyhead.next;  

    
    }
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
LC_2_ADD_two_num obj = new LC_2_ADD_two_num ();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.println("First Number:");
        obj.printList(l1);

        System.out.println("Second Number:");
        obj.printList(l2);
        ListNode result = obj.addTwoNumbers(l1, l2);

        System.out.println("Result (Sum):");
        obj.printList(result);
    }
}
