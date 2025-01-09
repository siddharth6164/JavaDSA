// GFG
// Indexes of Subarray Sum
import java.util.ArrayList;

public class indexesOfSubarraySum {
    public static ArrayList<Integer> subArraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    result.add(i + 1);
                    result.add(j + 1);
                    return result;
                }
                if (sum > target) {
                    break;
                }
            }
        }
        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5 };
        int target = 12;
        ArrayList<Integer> ans = subArraySum(arr, target);
        System.out.println(ans);
    }
}