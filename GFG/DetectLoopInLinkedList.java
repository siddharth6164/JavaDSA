// GFG
// 
public class DetectLoopInLinkedList {
    static class Node
     {
     int data;
     Node next;
     Node(int d) {data = d; next = null; }
     }
     public static  boolean detectLoop(Node head) {
         Node slow = head, fast = head;
         while(fast != null && fast.next != null){
             slow = slow.next;
             fast = fast.next.next;
             if(slow == fast){
                 return true;
             }
         }
         return false;
     
     }
     public static void main(String[] args) {
         Node head = new Node(1);
         head.next = new Node(8);
         head.next.next = new Node(3);
         head.next.next.next = new Node(4);
 
         System.out.println("Loop detected: " + detectLoop(head));  
         head.next.next.next.next = head.next;
         System.out.println("Loop detected: " + detectLoop(head));  
     }
 }