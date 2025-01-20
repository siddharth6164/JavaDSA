// GFG
// Merge Two Sorted Linked Lists
public class mergeTwoSortedLinkedLists {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    Node sortedMerge(Node head1, Node head2) {
        Node newHead = null, tmp = null;
        while(head1 != null || head2 != null){
            if(head1 != null && (head2 == null || (head1.data<head2.data))){
                if(newHead == null){
                    newHead = head1;
                    tmp = head1;
                }
                else{
                    tmp.next = head1;
                    tmp = head1;
                }head1 = head1.next;
            }else{
                if(newHead == null){
                    newHead = head2;
                    tmp = head2;
                }else{
                    tmp.next = head2;
                    tmp = head2;
                }
                head2 = head2.next;
            }
        }
        tmp.next = null;
        return newHead;
    }
    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        mergeTwoSortedLinkedLists listMerger = new mergeTwoSortedLinkedLists();
        
        Node list1 = listMerger.new Node(5);
        list1.next = listMerger.new Node(10);
        list1.next.next = listMerger.new Node(15);
        list1.next.next = listMerger.new Node(40);
        
        Node list2 = listMerger.new Node(2);
        list2.next = listMerger.new Node(3);
        list2.next.next = listMerger.new Node(20);
        
        Node mergedList = listMerger.sortedMerge(list1, list2);
        listMerger.printList(mergedList); 
    }
}