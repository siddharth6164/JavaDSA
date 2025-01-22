// Leetcode
// 1765. Map of Highest Peak
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Question1765 {
    static int[][] highestPeak(int[][] isWater) {
        // up, right, down, left
        int dir[][] = {{-1,0},{0,1},{1,0},{0,-1}};
        int n = isWater.length;
        int m = isWater[0].length;
        int[][] result = new int[n][m];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                if(isWater[i][j] == 1){
                    result[i][j] = 0;
                    queue.offer(new int[]{i, j});
                }else{
                    result[i][j] =-1;
                }
            }
        }
        while(!queue.isEmpty()){
            int cell[] = queue.poll();
            int row = cell[0];
            int col = cell[1];
            int h = result[row][col];
            for(int i = 0; i < 4; i++){
                int nrow = row + dir[i][0];
                int ncol = col + dir[i][1];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && result[nrow][ncol]==-1){
                    result[nrow][ncol]=h+1; //visit,height
                    queue.offer(new int[]{nrow,ncol});
                }
            }
        }
        return  result;
    }
    public static void main(String[] args){
        int[][] isWater = {{0,1},{0,0}};
        int[][] ans = highestPeak(isWater);
        for(int i = 0; i < ans.length; i++){
            System.out.println(Arrays.toString(ans[i]));
        }

    }
}
