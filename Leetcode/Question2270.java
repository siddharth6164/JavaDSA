// Leetcode
// 2270. Number of Ways to Split Array
public class Question2270 {
    public static void main(String[] args) {
        int[] arr = { 10, 4, -8, 7 };
        int n = arr.length;
        long totalSum = 0;
        int count = 0;
        for (int nums : arr) {
            totalSum += nums;
        }
        long prefixSum = 0;
        for (int i = 0; i < n - 1; i++) {
            prefixSum += arr[i];
            if (prefixSum >= totalSum - prefixSum) {
                count++;
            }
        }
        System.out.println(count);
    }
}