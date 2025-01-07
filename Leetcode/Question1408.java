// Leetcode
// 1408. String Matching in an Array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question1408 {
    // ---------------------------------- Solution 1 ----------------------------------
    public static String[] solution1(String[] s) {
        List<String> result = new ArrayList<String>();
        int n = s.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < s.length; j++) {
                if (i != j && s[i].contains(s[j])) {
                    if (!result.contains(s[j])) {
                        result.add(s[j]);
                    }
                }
            }
        }
        String[] output = new String[result.size()];
        result.toArray(output);
        return output;
    }

    // ---------------------------------- Soultion 2 ----------------------------------
    // Precompute LPS (Longest Prefix Suffix) array for all words
    public static void precomputeLPS(List<String> words, List<int[]> lps) {
        for (String word : words) {
            int m = word.length();
            int[] wordLPS = new int[m];

            // Two-pointer approach to calculate LPS
            int i = 1, j = 0;
            while (i < m) {
                if (word.charAt(i) == word.charAt(j)) {
                    wordLPS[i] = j + 1;
                    i++;
                    j++;
                } else if (j > 0) {
                    j = wordLPS[j - 1];
                } else {
                    i++;
                }
            }
            lps.add(wordLPS);
        }
    }

    // Function to match the pattern using LPS
    public static boolean stringMatcher(String pattern, int[] patternLPS, String text) {
        int patternSize = pattern.length();
        int textSize = text.length();
        int i = 0; // pattern pointer
        int j = 0; // text pointer

        while (i < patternSize && j < textSize) {
            if (pattern.charAt(i) == text.charAt(j)) {
                i++;
                j++;
            }
            if (i == patternSize) {
                return true;
            }

            if (j < textSize && pattern.charAt(i) != text.charAt(j)) {
                if (i > 0) {
                    i = patternLPS[i - 1];
                } else {
                    j++;
                }
            }
        }
        return false;
    }

    public static String[] solution2(String[] words) {
        int n = words.length;

        // STEP-1: Sort by word size
        Arrays.sort(words, Comparator.comparingInt(String::length));

        // STEP-2: Precompute LPS for all words
        List<int[]> lps = new ArrayList<>();
        precomputeLPS(Arrays.asList(words), lps);

        // STEP-3: Match all O(N^2) combinations of words
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (stringMatcher(words[i], lps.get(i), words[j])) {
                    res.add(words[i]);
                    break;
                }
            }
        }

        // Convert the result list to an array
        String[] result = new String[res.size()];
        return res.toArray(result);
    }

    public static void main(String[] args) {
        String[] s = { "mass", "as", "hero", "superhero" };
        // String[] res = solution1(s);
        String[] res = solution2(s);
        System.out.println(Arrays.toString(res));
    }
}
