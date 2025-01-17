// Leetcode
// 2683. Neighboring Bitwise XOR
public class Question2683 {
    public static boolean doesValidArrayExist(int[] arr){
        int res=0;
        for(int i:arr){
            res^=i;
        }
        return res==0;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0};
        boolean ans = doesValidArrayExist(arr);
        System.out.println(ans);
    }
}
