// 26. Remove Duplicates from Sorted Array
public class Question26 {
    public static int solution1(int[] nums){
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int ans = solution1(nums);
        System.out.println(ans);
    }
}
