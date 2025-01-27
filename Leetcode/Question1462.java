// Leetcode
// 1462. Course Schedule IV
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1462 {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        int INT_MAX = 10000;
        int[][] dist = new int[numCourses][numCourses];
        
        for (int i = 0; i < numCourses; i++) {
            Arrays.fill(dist[i], INT_MAX);
            dist[i][i] = 0; 
        }
        
        for (int[] edge : prerequisites) {
            dist[edge[0]][edge[1]] = 1;
        }
        
        for (int k = 0; k < numCourses; k++) {
            for (int i = 0; i < numCourses; i++) {
                for (int j = 0; j < numCourses; j++) {
                    if (dist[i][k] != INT_MAX && dist[k][j] != INT_MAX && dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        
        List<Boolean> ans = new ArrayList<>();
        for (int[] query : queries) {
            ans.add(dist[query[0]][query[1]] < INT_MAX);
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}