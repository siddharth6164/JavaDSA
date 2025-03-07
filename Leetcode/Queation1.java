// Leetcode
// 1. Two Sum

// Case1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. 

import java.util.Arrays;

public class Queation1 {
    static int[] solution(int[] arr, int traget){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i; i<arr.length; j++){
                if(arr[i]+arr[j]==traget){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ans = solution(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    
}
