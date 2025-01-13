// Leetcode
// 3223. Minimum Length of String After Operations
import java.util.HashMap;

public class Question3223 {
    public static int minimumLength(String s){
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char currentChar : s.toCharArray()) {
            charFrequencyMap.put(
                currentChar,
                charFrequencyMap.getOrDefault(currentChar, 0) + 1
            );
        }

        // Step 2: Calculate the number of characters to delete
        int deleteCount = 0;
        for (int frequency : charFrequencyMap.values()) {
            if (frequency % 2 == 1) {
                // If frequency is odd, delete all except one
                deleteCount += frequency - 1;
            } else {
                // If frequency is even, delete all except two
                deleteCount += frequency - 2;
            }
        }

        // Step 3: Return the minimum length after deletions
        return s.length() - deleteCount;
    }
    public static void main(String[] args){
        String s = "abaacbcbb";
        int ans = minimumLength(s);
        System.out.println(ans);
    }
}