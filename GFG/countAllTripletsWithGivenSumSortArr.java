// GFG
// Count all triplets with given sum in sorted array
public class countAllTripletsWithGivenSumSortArr {
    public static void main(String[] args) {
        int[] arr = {-3, -1, -1, 0, 1, 2};
        int target = -2;
        int count = 0;
        for (int i = 0; i < arr.length-2; i++) {
            
            int left = i+1; 
            int right = arr.length-1;

            while(left < right) {
                int sum = arr[i]+arr[left]+arr[right];
                if(sum == target) {
                    count++;
                    int temp = left+1;
                    while(temp<right && arr[temp]==arr[temp-1] ){
                        count++;
                        temp++;
                    }
                    right--;
                }else if(sum < target) {
                    left++;
                }else{
                    right--;
                }
            }
        }
        System.out.println(count);
    }
    
}