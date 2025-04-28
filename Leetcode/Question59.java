    // 56. Merge Intervals
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;;
public class Question59 {
    public static int[][] solution1(int[][] arr){
        Arrays.sort(arr,(a,b)->a[0]-b[0]);

        List<int[]> ans = new ArrayList<>();
        ans.add(arr[0]);
        int j=0;
        for(int i=1;i<arr.length;i++){
            int[] interval = ans.get(j);
            if(arr[i][0]<=interval[1]){
                interval[1]=Math.max(interval[1],arr[i][1]);
            }else{
                ans.add(arr[i]);
                j++;
            }
        }
        int[][] realans = new int[j+1][2];
        for(int i=0;i<j+1;i++){
            realans[i]=ans.get(i);
        }
        return realans;
    }

    public static void main(String[] args) {
        int[][] arr= {{1,4},{4,8}};
        int[][] output = solution1(arr);
        for(int[] i:output){
            System.out.println(Arrays.toString(i));
        }
    }
}
