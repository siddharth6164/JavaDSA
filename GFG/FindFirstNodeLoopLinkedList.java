// GFG
// Find the first node of loop in linked list
public class FindFirstNodeLoopLinkedList {
    static class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}
 static Node findFirstNode(Node head) {
    Node slow = head, fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast){
            slow=head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }
    return null;
    
}

 static void createCycle(Node head, int cycleStartIndex) {
    Node current = head;
    Node cycleStartNode = null;
    int index = 0;
    
    while (current.next != null) {
        if (index == cycleStartIndex) {
            cycleStartNode = current;
        }
        current = current.next;
        index++;
    }
    current.next = cycleStartNode; // Create the cycle
}

 static Node createList(int[] values) {
    Node head = new Node(values[0]);
    Node current = head;
    for (int i = 1; i < values.length; i++) {
        current.next = new Node(values[i]);
        current = current.next;
    }
    return head;
}
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5}; // Sample list values
        Node head = createList(values);
        
        // Create a cycle in the list (e.g., cycle starting at index 2)
        createCycle(head, 2);

        // Find the first node in the cycle
        Node cycleStart = findFirstNode(head);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.data);
        } else {
            System.out.println("No cycle detected");
        }
    }
}