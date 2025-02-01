// Leetcode
// 3151. Special Array I
public class Question3151 {
    public static boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; ++i) {
            if ((nums[i] % 2) == (nums[i - 1] % 2)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] num = {1};
        boolean res = isArraySpecial(num);
        System.out.println(res);

    }
}