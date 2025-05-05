public class Question11 {
    public static int solution(int[] height){
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left<right)
        {
            int width = right-left;
            int currentHeight = Math.min(height[left] , height[right]);

            int area = currentHeight * width;

            //update the max area

            maxArea = Math.max(area , maxArea);

            if(height[left]  < height[right])
            {
                left++; }
                else{
                    right--;
                }
            
        }
        return maxArea;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        int n = solution(nums);
        System.out.println(n);
    }
}
