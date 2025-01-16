// Leetcode
// 2425. Bitwise XOR of All Pairings
public class Question2425 {
    public static int xorAllNums(int[] nums1, int[] nums2) {
        int ans = 0;

        int m = nums2.length;
        if ((m & 1) == 1) {
            for (int ele : nums1) {
                ans ^= ele;
            }
        }

        int n = nums1.length;
        if ((n & 1) == 1) {
            for (int ele : nums2) {
                ans ^= ele;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] num1 = {2,1,3};
        int[] num2 = {10,2,5,0};
        int ans = xorAllNums(num1, num2);
        System.out.println(ans);
    }
}
