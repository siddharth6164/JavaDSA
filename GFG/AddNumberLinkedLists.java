// GFG
// Add Number Linked Lists
public class AddNumberLinkedLists {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next =null;
        }
    }

    static Node reverseList(Node head){
        Node current = head;
        Node prev = null;
        Node next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    static Node addTwNode(Node num1, Node num2){
        Node rev1 = reverseList(num1);
        Node rev2 = reverseList(num2);
        int carry = 0;
        Node head = null;
        Node tail = head;
        while(rev1!=null || rev2!=null || carry!=0 ){
            int val1 = 0;
            int val2 = 0;
            if(rev1!=null){
                val1 = rev1.data;
            }
            if(rev2!=null){
                val2 = rev2.data;
            }
            int sum = val1 + val2 + carry;
            int digit = sum % 10;
            carry = sum/10;
            Node temp = new Node(digit);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            if(rev1!=null){
                rev1 = rev1.next;
            }
            if(rev2!=null){
                rev2 = rev2.next;
            }
        }
        Node result = reverseList(head);
        while(result!=null){
            if(result.data!=0){
                break;
            }
            result = result.next;
        }
        return result;
    }


    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node num1 = new Node(4);
        num1.next = new Node(5);

        Node num2 = new Node(3);
        num2.next = new Node(4);
        num2.next.next = new Node(5);

        Node result = addTwNode(num1, num2);
        printList(result);
    }
}