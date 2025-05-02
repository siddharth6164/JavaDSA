// 560. Subarray Sum Equals K
import java.util.HashMap;
public class Question560 {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k =2;
        HashMap<Integer, Integer> psc = new HashMap<>();
        psc.put(0, 1); // base case: prefix sum = 0 has occurred once
        int s = 0; // running sum
        int c = 0; // count of subarrays

        for (int num : nums) {
            s += num; // update running sum

            // if (s - k) has occurred before, then a subarray summing to k ends here
            if (psc.containsKey(s - k)) {
                c += psc.get(s - k);
            }

            // update frequency of current sum
            psc.put(s, psc.getOrDefault(s, 0) + 1);
        }

        System.out.println(c);
    }
}