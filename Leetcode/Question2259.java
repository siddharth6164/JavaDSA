
// Leetcode
// 2559. Count Vowel Strings in Ranges
import java.util.Arrays;
import java.util.HashSet;

public class Question2259 {
    public static void main(String[] args) {
        String[] words = { "aba", "bcb", "ece", "aa", "e" };
        int[][] queries = { { 0, 2 }, { 1, 4 }, { 1, 1 } };
        int[] ans = new int[queries.length];
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int[] prefixSum = new int[words.length];
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            String currentword = words[i];
            if (vowels.contains(currentword.charAt(0))
                    && vowels.contains(currentword.charAt(currentword.length() - 1))) {
                sum++;
            }
            prefixSum[i] = sum;
        }
        for (int i = 0; i < queries.length; i++) {
            int[] currentQuery = queries[i];
            ans[i] = prefixSum[currentQuery[1]] - (currentQuery[0] == 0 ? 0 : prefixSum[currentQuery[0] - 1]);
        }
        System.out.println(Arrays.toString(ans));
    }
}
