// GFG
// Sum Pair closest to target
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sumPairClosestToTarget {
    public static List<Integer> sumClosest(int[] arr, int target) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        int minDiff = Integer.MAX_VALUE;
        while (left < right) {
            int sum = arr[left] + arr[right];
            int diff = Math.abs(target - sum);
            if (diff < minDiff) {
                minDiff = diff;
                ans = Arrays.asList(arr[left], arr[right]);
            }
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 30, 20, 5 };
        int target = 25;
        List<Integer> output = sumClosest(arr, target);
        System.out.println(output);

    }
}
