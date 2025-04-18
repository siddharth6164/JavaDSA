import java.util.Arrays;

public class Question283 {
    public static void solution2(int[] nums) {
        int nonZeroIndex=0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonZeroIndex]=nums[i];
                nonZeroIndex++;
            }
        }
        while(nonZeroIndex<nums.length){
            nums[nonZeroIndex]=0;
            nonZeroIndex++;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void solution1(int[] nums) {
        int j=0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        solution1(nums);
        solution2(nums);
    }
}
