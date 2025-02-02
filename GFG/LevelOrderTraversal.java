// GFG
// Level order traversal
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    class Node {
        int data;
        Node left, right;
    
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList();
         Queue<Node> q = new LinkedList();
         q.add(root);
         while(!q.isEmpty()){
             int size = q.size();
             ArrayList<Integer> level = new ArrayList();
             while(size-->0){
                 Node tmp = q.poll();
                 level.add(tmp.data);
                 if(tmp.left!=null){
                     q.add(tmp.left);
                 }
                 if(tmp.right!=null){
                     q.add(tmp.right);
                 }
                 
             }
             ans.add(level);
         }
         return ans;
    }
    public static void main(String[] args) {
        
    }

}