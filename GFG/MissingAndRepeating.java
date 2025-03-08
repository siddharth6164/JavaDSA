// Missing And Repeating
// Given an unsorted array arr of positive integers. One number a from the set [1, 2,....,n] is missing and one number b occurs twice in the array. Find numbers a and b.

import java.util.ArrayList;

public class MissingAndRepeating {
    static ArrayList<Integer> solution(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            int element = Math.abs(arr[i]);
            if(arr[element-1]<0){
                ans.add(0,element);
            }else{
                arr[element-1]*=-1;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans.add(1,i+1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,3};
        ArrayList<Integer> ans = solution(arr);
        System.out.println(ans);
    }
}
