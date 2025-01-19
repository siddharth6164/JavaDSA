// Leetcode
// 407. Trapping Rain Water II

import java.util.PriorityQueue;

public class Question407 {
    private static boolean isValid(int x, int y, int m, int n) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }
    public static int trapRainWater(int[][] heightMap) {
        int m = heightMap.length;
        int n = heightMap[0].length;
        if (m < 3 || n < 3) // Need minimum 3x3 matrix to hold water
            return 0;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        boolean[][] visited = new boolean[m][n];

        // Step-1: Push all boundary elements as START points
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    minHeap.offer(new int[] { heightMap[i][j], i, j });
                    visited[i][j] = true;
                }
            }
        }

        // Step-2: Apply BFS similar to level-order traversal
        int level = 0;
        int trappedWater = 0;
        int[] dir = { -1, 0, 1, 0, -1 };

        while (!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int height = curr[0];
            int x = curr[1];
            int y = curr[2];
            level = Math.max(level, height);

            // 4-directional traversal
            for (int i = 0; i < 4; i++) {
                int newX = x + dir[i];
                int newY = y + dir[i + 1];
                if (isValid(newX, newY, m, n) && !visited[newX][newY]) {
                    visited[newX][newY] = true;
                    minHeap.offer(new int[] { heightMap[newX][newY], newX, newY });
                    if (heightMap[newX][newY] < level) {
                        trappedWater += level - heightMap[newX][newY];
                    }
                }
            }
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,4,3,1,3,2},{3,2,1,3,2,4},{2,3,3,2,3,1}};
        int res = trapRainWater(arr);
        System.out.println(res);
    }
}
