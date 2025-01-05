// leetcode
// 2381. Shifting Letters II
import java.util.Arrays;

public class Question2381 {
    public static void main(String[] args) {
        String s = "dztz";
        int n=s.length();
        int[][] shifts = {{0,0,0},{1,1,1}};
        int[] arr = new int[n];
        for(int[] shift: shifts) {
            if(shift[2]==1){
                arr[shift[0]]++;
                if(shift[1]+1<n){
                    arr[shift[1]+1]--;
                }
            }
            else{
                arr[shift[0]]--;
                if(shift[1]+1<n){
                    arr[shift[1]+1]++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));   
        StringBuilder result = new StringBuilder(s);
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum = (sum+arr[i])%26;
            if(sum<0){
                sum+=26;
            }
            char shiftedChar = (char)('a'+((s.charAt(i)-'a'+sum)%26));
            result.setCharAt(i, shiftedChar);
        }
        System.out.println(result.toString());
    }
}
