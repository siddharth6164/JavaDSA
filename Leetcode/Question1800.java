// Leetcode
// 1800. Maximum Ascending Subarray Sum
public class Question1800 {
    public static int maxAscendingSum(int[] nums){
        int n = nums.length;
        int r = 1, sum = nums[0], maxSum = nums[0];

        while(r<n){
            while(r < n && nums[r] > nums[r-1]){
                sum += nums[r];
                r++;
            }
            maxSum = Math.max(maxSum, sum);
            if(r<n){
                sum = nums[r];
            }
            r++;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] num = {10,20,30,5,10,50};
        int res = maxAscendingSum(num);
        System.out.println(res);
    }
}