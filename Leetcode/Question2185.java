// Leetcode
// 2185. Counting Words With a Given Prefix

public class Question2185 {
    public static int hasprefix(String s, String prefix) {
        int itr;
        for(itr = 0; itr < s.length() && itr<prefix.length(); itr++){
            if(s.charAt(itr)!=prefix.charAt(itr)){
                return 0;
            }
        }
        if(itr!=prefix.length()){
            return 0;
        }
        return 1;
    }
    public static int prefixCount(String[] words, String pref) {
        int count =0;
        for(String word:words){
            count+=hasprefix(word, pref);
        }
        return count;
    }
    public static void main(String[] args){
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        int output = prefixCount(words, pref);
        System.out.println(output);
    }
}
