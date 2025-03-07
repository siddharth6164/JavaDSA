// Question--> Array Duplicates 
// Given an array arr of integers, find all the elements that occur more than once in the array. 
// If no element repeats, return an empty array.

// Case 1
// Input: arr[] = [2, 3, 1, 2, 3]
// Output: [2, 3] 
// Explanation: 2 and 3 occur more than once in the given array.

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDuplicates {

    static List<Integer> solution(int[] arr){
        // ------------------- Soultion 1 -------------------
        // List<Integer> ans = new ArrayList<>();
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             ans.add(arr[i]);
        //         }
        //     }
        // }
        // return ans;

        // ------------------- Optimise Soultion 2 -------------------
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,3};
        List<Integer> ans = solution(arr);
        System.out.println(ans);
    }
}
