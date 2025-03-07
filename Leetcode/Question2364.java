// leetcode
// 2364. Count Number of Bad Pairs

import java.util.HashMap;

public class Question2364 {
    public static long countBadPairs(int[] nums){
        long n = nums.length;
        HashMap<Integer, Integer>freq = new HashMap<>();
        long goodPairs = 0;

        for(int i=0;i<n;i++){
            int key = nums[i]-i;
            if(freq.containsKey(key)){
                goodPairs += freq.get(key);
            }
            freq.put(key, freq.getOrDefault(key, 0) +1);
        }
        long badPairs = n * (n-1)/2 - goodPairs;
        return badPairs;
    }
    public static void main(String[] args) {
        int[] nums = {4,1,3,3};
        long res = countBadPairs(nums);
        System.out.println(res);
    }
}