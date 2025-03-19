// Kth Smallest

import java.util.Arrays;

public class Question3 {
    static int Kthsmallest(int[] arr,int k){
        if(arr.length == 1){
            return arr[0] ;
        }
        //sort the array with pivot technique
        int pivot = arr.length - 1;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < pivot ; j++) {
                if(arr[j] > arr[pivot]) {
                    int temp = arr[j];
                    arr[j] = arr[pivot];
                    arr[pivot] = temp;
                }
            }

            if(pivot > 0 ) pivot--;
        }

        return arr[k - 1];
    }
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int k = 3;
        System.out.println(Arrays.toString(arr));
        int ans = Kthsmallest(arr,k);     
        System.out.println(ans);
    }
}
