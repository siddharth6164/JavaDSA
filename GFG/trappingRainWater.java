// GFG
// Trapping Rain Water

public class trappingRainWater {
    public static int maxWater(int arr[]) {
        int totalwater = 0;
        int left = 0;
        int right = arr.length-1;
        int leftmax = 0;
        int rightmax = 0;
        while(left < right){
            leftmax = Math.max(leftmax,arr[left]);
            rightmax = Math.max(rightmax,arr[right]);
            if(arr[left]<arr[right]){
                totalwater += leftmax-arr[left];
                left++;
            }else{
                totalwater += rightmax+arr[right];
                right--;
            }
        }
        return totalwater;
    }
    public static void main(String[] args){
        int[] arr = {3,0,1,0,4,0,2};
        int ans = maxWater(arr);
        System.out.println(ans);
    }
}