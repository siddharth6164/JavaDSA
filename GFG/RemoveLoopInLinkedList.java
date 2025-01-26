// GFG
// Remove loop in Linked List
public class RemoveLoopInLinkedList {
    static class Node{
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    public static void removeLoop(Node head) {
        if (head == null || head.next == null) return;
        Node slow=head, fast = head, prev = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            prev = fast;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                prev = prev.next;
                while(slow!=fast){
                    slow = slow.next;
                    fast=fast.next;
                    prev = prev.next;
                }
                prev.next = null;
                return;
            }
        }
    }

    public static Node createLinkedListWithLoop() {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; 

        return head;
    }
    public static void main(String[] args) {
        Node head = createLinkedListWithLoop();
        
        removeLoop(head);
        
        System.out.println("Loop removed successfully (Check manually or with a print statement).");
    }
}