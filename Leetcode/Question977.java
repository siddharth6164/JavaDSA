// 977. Squares of a Sorted Array

import java.util.Arrays;
public class Question977 {
    public static int[] solution1(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i] = nums[left] * nums[left];
                left++;
            } else {
                res[i] = nums[right] * nums[right];
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 20 };
        int[] arr = solution1(nums);
        System.out.println(Arrays.toString(arr));
    }
}