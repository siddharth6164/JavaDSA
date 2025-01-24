// GFG
// Clone List With Next And Random
public class CloneListWithNextAndRandom {
    static class Node  {
        int data;
        Node next;
        Node random;
    
        Node(int x) {
            data = x;
            next = null;
            random = null;
        }
    }
    
        public static Node cloneLinkedList(Node head) {
            if(head == null) return null;
            Node curr = head;
            while(curr != null){
                Node copy = new Node(curr.data);
                copy.next = curr.next;
                curr.next = copy;
                curr = copy.next;
            }
            curr = head;
            while(curr != null){
                if(curr.random != null){
                    curr.next.random = curr.random.next;
                }
                curr = curr.next.next;
            }
            curr = head;
            Node copyH = head.next;
            while(curr != null){
                Node copy = curr.next;
                curr.next = copy.next;
                if(copy.next != null){
                    copy.next = copy.next.next;
                }
                curr = curr.next;
            }
         return copyH;
        }

        public static void printList(Node head) {
            Node curr = head;
            while (curr != null) {
                System.out.print("Data: " + curr.data);
                if (curr.random != null) {
                    System.out.print(", Random: " + curr.random.data);
                } else {
                    System.out.print(", Random: null");
                }
                System.out.println();
                curr = curr.next;
            }
        }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        // Setting random pointers
        head.random = third;
        second.random = head;
        third.random = second;
        fourth.random = third;

        System.out.println("Original List:");
        printList(head);

        // Cloning the linked list
        Node clonedHead = cloneLinkedList(head);

        System.out.println("\nCloned List:");
        printList(clonedHead);
    }   
}