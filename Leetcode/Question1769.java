// Leetcode
// 1769. Minimum Number of Operations to Move All Balls to Each Box

import java.util.Arrays;

public class Question1769 {
    // --------------------------------- Solutions-1 ---------------------------------
    public static int[] solution1(String s) {
        int[] ans = new int[s.length()];
        for (int currentBox = 0; currentBox < s.length(); currentBox++) {
            if (s.charAt(currentBox) == '1') {
                for (int newPostion = 0; newPostion < s.length(); newPostion++) {
                    ans[newPostion] += Math.abs(newPostion - currentBox);
                }
            }
        }
        return ans;
    }

    // --------------------------------- Solutions-2 ---------------------------------
    public static int[] solution2(String boxes) {
        int n = boxes.length();
        int sum = 0;
        int rightOnes = 0;
        int[] res = new int[n];
        int prefixSum = 0;
        int leftOnes = 0;

        // Calculate initial sum and count of '1's to the right
        for (int i = 0; i < n; ++i) {
            if (boxes.charAt(i) == '1') {
                sum += i;
                rightOnes++;
            }
        }

        // Calculate moves per position
        for (int i = 0; i < n; ++i) {
            int moves = sum + prefixSum;
            res[i] = moves;

            // Update both sum and prefixSum
            if (boxes.charAt(i) == '1') {
                leftOnes++;
                rightOnes--;
            }
            prefixSum += leftOnes;
            sum -= rightOnes;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "110";
        // solution 1
        // int[] ans = solution1(s);
        // solution 2
        int[] ans = solution2(s);
        System.out.println(Arrays.toString(ans));
    }
}
