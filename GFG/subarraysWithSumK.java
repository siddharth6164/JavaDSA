// GFG
// Sub-Arrays With Sum K
import java.util.HashMap;
public class subarraysWithSumK {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr = {10,2,-2,-20,10};
        int k = -10;
        int sum=0;
        int count=0;
        for (int i=0; i<arr.length; i++) {
            sum+=arr[i];
            if(sum==k){
                count+=1;
            }
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }
}
