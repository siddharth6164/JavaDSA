// Leetcode
// 2116. Check if a Parentheses String Can Be Valid

public class Question2116 {
    public static boolean canBeValid(String s, String locked){
        int length = s.length();
        if(length % 2 != 0){
            return false;
        }
        int opening =0,closing =0;
        int wildCard =0;
         for(int i=0; i<length;i++){
            if(locked.charAt(i) == '0'){
                wildCard++;
            } else if(s.charAt(i)=='('){
                opening++;
            }else{
                closing++;
            }

            if(wildCard < (closing - opening)){
                return false;
            }
         }

         opening = closing = wildCard =0;
         for(int i=length-1;i>= 0;i--){
            if(locked.charAt(i) == '0'){
                wildCard++;
            }else if(s.charAt(i) == '('){
                opening++;
            }else {
                closing++;
            }

            if(wildCard < (opening - closing)){
                return false;
            }
         }
         return true;
    }
    public static void main(String[] args) {
        String s = "))()))";
        String locked = "010100";
        boolean ans = canBeValid(s, locked);
        System.out.println(ans);
    }
}
