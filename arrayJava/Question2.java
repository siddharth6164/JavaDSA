// Maximum and minimum of an array using minimum number of comparisons

import java.util.Arrays;

public class Question2 {
    static void maxmin(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Maximum element is : "+max);
        System.out.println("Minimum element is : "+min);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,9};
        System.out.println("Array--> "+Arrays.toString(arr));
        maxmin(arr);

    }    
}
