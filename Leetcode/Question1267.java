// Leetcode
// 1267. Count Servers that Communicate
public class Question1267 {
    public static int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [] rowCount = new int[m];
        int [] colCount = new int[n];
        int totalServers =0;
        
        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++){
                if(grid[i][j]== 1){
                    rowCount[i]++;
                    colCount[j]++;
                    totalServers++;
                }
            }
        }
        for(int i=0; i<m ;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1 && rowCount[i] == 1 && colCount[j] == 1){
                    totalServers--;
                }
            }
        }

        return totalServers;
        
    }
    public static void main(String[] args) {
        int [][] arr = {{1,0},{0,1}};
        int res = countServers(arr);
        System.out.println(res);
    }
}