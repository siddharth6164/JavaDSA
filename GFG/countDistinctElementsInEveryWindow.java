// GFG
// Count distinct elements in every window

import java.util.ArrayList;
import java.util.HashSet;

public class countDistinctElementsInEveryWindow {
    public static ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<=n-k;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(arr[j]);
            }
            int len=set.size();
            res.add(len);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k=4;
        ArrayList<Integer> ans =countDistinct(arr,k);
        System.out.println(ans);
    }
}
