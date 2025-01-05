// GFG
// Count Pairs whose sum is less than target

import java.util.Arrays;;
public class countPairsWhoseSumIsLessThanTarget {
    public static void main(String[] args) {
        int[] arr = {2,1,8,3,4,7,6,5};
        int traget = 7;
        Arrays.sort(arr);
        int n =arr.length;
        int i=0;
        int j=n-1;
        int count = 0;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum < traget){
                count+=(j-i);
                i++;
            }
            else if(sum >= traget){
                j--;
            }
        }
        System.out.println(count);
    }
}