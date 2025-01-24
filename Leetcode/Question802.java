// Leetcode
// 802. Find Eventual Safe States

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question802 {
    private static boolean[] safeNodes;
    private static boolean checkSafeState(List<List<Integer>> graph, int[] visited, int curr) {
        visited[curr] = 1; 
        boolean isSafe = true;
        for (int neighbor : graph.get(curr)) {
            if (visited[neighbor] == 0) { 
                            isSafe &= checkSafeState(graph, visited, neighbor);
                        } else if (visited[neighbor] == 1) { 
                            safeNodes[curr] = false;
                            return false;
                        } else if (visited[neighbor] == 2) { 
                            isSafe &= safeNodes[neighbor];
                        }
                    }
            
                    visited[curr] = 2; 
                    safeNodes[curr] = isSafe;
                    return isSafe;
                }
            
                public static List<Integer> eventualSafeNodes(int[][] graph) {
                    int n = graph.length;
                    safeNodes = new boolean[n]; 
                Arrays.fill(safeNodes, true); 
        
                int[] visited = new int[n]; 
        
                List<List<Integer>> graphList = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    List<Integer> neighbors = new ArrayList<>();
                    for (int neighbor : graph[i]) {
                        neighbors.add(neighbor);
                    }
                    graphList.add(neighbors);
                }
        
                for (int i = 0; i < n; i++) {
                    if (visited[i] == 0) {
                        checkSafeState(graphList, visited, i);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (safeNodes[i]) {
                result.add(i);
            }
        }
        return result;
    }
 public static void main(String[] args) {
    int[][] graph = {
        {1, 2}, 
        {2, 3}, 
        {5}, 
        {0}, 
        {5}, 
        {}, 
        {}
    };

    List<Integer> safeNodes = eventualSafeNodes(graph);
    System.out.println(safeNodes);
 }   
}