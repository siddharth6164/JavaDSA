// Leetcode
// 69. Sqrt(x)

// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

// Case 1:
// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.


public class Question69 {
    static int mySqrt(int x) {
        if(x==0){
              return 0;
          }
          int low=1;int high=x;int result=0;
          while(low<=high){
              int mid=low+(high-low)/2;
              if(mid<=x/mid){
                  result=mid;
                  low=mid+1;
              }else{
                  high=mid-1;
              }
          }
          return result;  
      }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(mySqrt(n));
    }
}
