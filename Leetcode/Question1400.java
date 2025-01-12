// Leetcode
// 1400. Construct K Palindrome Strings
 
public class Question1400 {
    public static boolean canConstruct(String str, int k){
        if(k>str.length()) return false;
        if(k==str.length()) return true;
        int[] freq = new int[26];
        for(char ch: str.toCharArray()){
            freq[ch-'a']++;
        }
        int oddfreqcount=0;
        for(int i=0;i<26;i++){
            if(freq[i]%2!=0){
                oddfreqcount++;
            }
        }
        return oddfreqcount<=k;
    }
    public static void main(String[] args) {
        String s ="aaaa";
        int k = 2;
        boolean ans = canConstruct(s,k);        
        System.out.println(ans);
    }
}
