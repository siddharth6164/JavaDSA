// Leetcode
// 2948. Make Lexicographically Smallest Array by Swapping Elements

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question2948 {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        List<int[]> copy = new ArrayList<>();
        for(int i=0; i<n; i++){
            copy.add(new int[]{nums[i],i});
        }

        copy.sort(Comparator.comparingInt(a -> a[0]));
        int left =0, right=1;
        while(right<n){
            List<Integer> pos = new ArrayList<>();
            pos.add(copy.get(left)[1]);

            while (right < n && Math.abs(copy.get(right)[0] - copy.get(right - 1)[0]) <= limit){
                pos.add(copy.get(right)[1]);
                right++;
            }
            Collections.sort(pos);
            for(int i=0; i<right-left; i++){
                nums[pos.get(i)] = copy.get(left+i)[0];
            }
            left = right;
            right++;
        }

        return nums;
    }
    public static void main(String[] args) {
        int [] arr = {1,5,3,9,8};
        int limit = 2;

        Question2948 solution = new Question2948();
        int[] result = solution.lexicographicallySmallestArray(arr, limit);

        System.out.println(Arrays.toString(result));

    }
}