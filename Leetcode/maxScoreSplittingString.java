//Leetcode
//1422. Maximum Score After Splitting a String
public class maxScoreSplittingString {
    public static void main(String[] args) {
        String s = "1111";
        int max = 0;
        for(int i = 1; i < s.length(); i++){
            int zero = 0;
            int one = 0;
            for(int j=0;j<i;j++) {
                if(s.charAt(j)=='0'){
                    zero=zero+1;
                }
            }
            for(int k=i; k<s.length(); k++){
                if(s.charAt(k)=='1'){
                    one=one+1;
                }
            }
            int sum=zero+one;
            if(max<sum){
                max=sum;
            }
        }
        System.out.println(max);
    }
}