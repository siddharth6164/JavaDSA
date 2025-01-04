// GFG
// Count Subarrays With Given XOR

import java.util.HashMap;

public class countSubarraysWithGivenXOR {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = { 4, 2, 2, 6, 4 };
        int k = 6;
        int prefixxor = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixxor = prefixxor ^ arr[i];
            if (prefixxor == k) {
                count++;
            }
            if (map.containsKey((prefixxor ^ k))) {
                count += map.get(prefixxor ^ k);
            }
            map.put(prefixxor, map.getOrDefault(prefixxor, 0) + 1);
        }
        System.out.println(count);
    }
}
