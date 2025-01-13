// GFG
// Container With Most Water

public class containerWithMostWater {
    public static int maxWater(int arr[]) {
        int n = arr.length;
        int maxArea = 0,area=0;
        int start = 0, end=n-1;
        while(start<end){
            area = Math.min(arr[start],arr[end])*(end-start);
            maxArea = Math.max(maxArea,area);
            if(arr[start]<arr[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxArea;    
    }
    public static void main(String[] args){
            // Code Here
        int[] arr = {1,5,4,3};
        int ans = maxWater(arr);
        System.out.println(ans);
    }
}
