// GFG
// Largest subarray of 0's and 1's

import java.util.HashMap;

public class largestSubarrayOf0And1 {
    public static int maxLen(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0,fans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                sum--;
            }else{
                sum++;
            }
            if(sum==0){
                fans=i+1;
            }
            if(map.containsKey(sum)){
                fans=Math.max(fans,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return fans;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,0,0};
        int ans =maxLen(arr);
        System.out.println(ans);
    }
}
