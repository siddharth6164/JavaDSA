// Leetcode
// 2658. Maximum Number of Fish in a Grid
public class Question2658 {
    static int[] dir = {-1,0,1,0,-1};
    
        static boolean isValid(int x,int y, int m, int n){
                    return x >= 0 && x<  m && y >= 0 && y<n;
                }
            
                static int dfs(int[][] grid, boolean[][] visited, int m, int n, int x, int y){
                    int fishCount = grid[x][y];
                    for(int i=0;i<4;i++){
                        int newX = x + dir[i];
                    int newY = y + dir[i+1];
                    if(isValid(newX,newY,m,n) && !visited[newX][newY] && grid[newX][newY] > 0){
                visited[newX][newY] = true;
                fishCount += dfs(grid,visited,m,n,newX,newY);
            }
        }
        return fishCount;
    }
    public static int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxFish = 0;

        boolean[][] visited = new boolean[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j] && grid[i][j] >0){
                    visited[i][j] = true;

                    maxFish = Math.max(maxFish, dfs(grid,visited,m,n,i,j));
                }
            }
        }
        return maxFish;
    }
    public static void main(String[] args) {
        int[][] grid = {{9,10}};
        int res = findMaxFish(grid);
        System.out.println(res);
    }
}