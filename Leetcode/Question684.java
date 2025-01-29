// Leetcode
// 684. Redundant Connection

public class Question684 {
    private static int find(int[] dsuf, int v) {
            if (dsuf[v] == -1) 
                return v;
            return dsuf[v] = find(dsuf, dsuf[v]); 
        }
    
        public static int[] findRedundantConnection(int[][] edges) {
            int n = edges.length;
            int[] dsuf = new int[n + 1];
            Arrays.fill(dsuf, -1);
    
            for (int[] edge : edges) {
                int parentX = find(dsuf, edge[0]);
            int parentY = find(dsuf, edge[1]);

            if (parentX == parentY) 
                return edge;
            else 
                dsuf[parentX] = parentY;
        }
        return new int[]{0, 0};
    }
    public static void main(String[] args) {
        int[][] edges = {{1,2},{1,3},{2,3}};
        int[] redundantEdge = findRedundantConnection(edges);
        System.out.println("Redundant edge: " + Arrays.toString(redundantEdge));
    }
}