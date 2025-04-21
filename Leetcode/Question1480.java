// 1480. Running Sum of 1d Array

import java.util.Arrays;

public class Question1480 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] arr = new int[nums.length];
        int ans =0;
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
            arr[i]=ans;
        }
        System.out.println(Arrays.toString(arr));
    }
}