// GFG
// Pair with given sum in a sorted array

public class pairWithGivenSuminaSortedArray {
    public static int countPairs(int[] arr, int target){
        int length = arr.length;
        int count = 0;
        int start =0,end = length-1;

        while(start < end){
            int sum = arr[start] + arr[end];
            if(sum > target){
                end-- ;
            }else if(sum < target){
                start++;
            }else if(sum == target){
                int ele1 =arr[start], ele2 = arr[end];
                int c1 =0, c2=0;

                while(start <= end && arr[start] == ele1){
                    c1++;
                    start++;
                }
                while(start <= end && arr[end] == ele2){
                    c2++;
                    end--;
                }
                if(ele1 == ele2){
                    count += c1*(c1-1)/2;
                }
                else {
                    count += c1*c2;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {-1,1,5,5,7};
        int target = 6;
        int ans = countPairs(arr, target);
        System.out.println(ans);
    }
}