// 54. Spiral Matrix
import java.util.ArrayList;
import java.util.List;
public class Question54 {
    public static List<Integer> solution(int[][] matrix){
        List<Integer> ans = new ArrayList<>();
        int top = 0,bottom = matrix.length-1;
        int left = 0,right = matrix[0].length-1;
        while(top<=bottom && left<=right){
            //top row
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            //right Column
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                //bottom row
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                //left column
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans = solution(matrix);
        System.out.println(ans);
    }
}