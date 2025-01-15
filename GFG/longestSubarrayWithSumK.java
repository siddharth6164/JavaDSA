import java.util.HashMap;

public class longestSubarrayWithSumK {
    public static int longestSubarray(int[] arr, int k) {
        // code here
        int sum=0,len=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
            if(sum==k){
                len=Math.max(len,i+1);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum-k)){
                len=Math.max(len,i-map.get(sum-k));
            }
        }
        return len;
    }
    public static void main(String[] args){
        int[] arr = {94,-33,-13,40,-82,94,-33,-13,40,-82};
        int k =52;
        int ans = longestSubarray(arr, k);
        System.out.println(ans);
    }
    
}
