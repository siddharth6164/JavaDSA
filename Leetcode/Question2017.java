// Leetcode
// 2017. Grid Game 

public class Question2017 {
    public static long gridGame(int[][] grid) {
        int n = grid[0].length;
        if(n<2) return 0;

        long topSum =0, bottomSum =0;

        for(int val:grid[0]){
            topSum += val;
        }
         long minSum = Long.MAX_VALUE;
         for(int i=0; i<n;i++){
            topSum -= grid[0][i];
            minSum = Math.min(minSum, Math.max(topSum, bottomSum));
            bottomSum += grid[1][i];
         }
            return minSum;
    }
    public static void main(String[] args) {
        int grid [][] = {{2,5,4},{1,5,1}};
        long res = gridGame(grid);
        System.out.println(res);
    }
}