// 724.  Pivot IndeFindx
public class Question724 {
    public static int solution1(int[] nums,int n){
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = nums[0];
        right[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            left[i] = nums[i]+left[i-1];
            right[n-i-1] = nums[n-1-i] + right[n-i]; 
        }
        for(int i = 0; i < n; i++){
           if(left[i]==right[i]){
            return i;
           } 
        }
        return -1;
    }
    public static int solution2(int[] nums,int n) {
        int rightSum = 0;
        for(int num : nums){
            rightSum+=num;
        }
        int leftSum = 0;
        for(int i=0;i<nums.length;i++){
            rightSum -= nums[i];  
            if(leftSum == rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int n = nums.length;
        System.out.println(solution1(nums,n));
        System.out.println(solution2(nums,n));
    }
}
