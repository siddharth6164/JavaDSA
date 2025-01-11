// GFG
// Longest substring with distinct characters
public class longestSubstringWithDistinctCharacters {
    public static int distinctCharcter(String s) {
        int n = s.length();
        int[] freq = new int[26];
        int i = 0, j = 0,count = 0;
        while(j<n){
            int ch = s.charAt(j)-'a';
            if(freq[ch]>0){
                count = Math.max(count,j-i);
                while(i<j && s.charAt(i)!=s.charAt(j)){
                    freq[s.charAt(i)-'a'] = 0;
                    i++;
                }
                i++;
            }else{
                freq[ch]++;
            }
            j++;
        }
        count = Math.max(count,j-i);
        return count;
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int result = distinctCharcter(s);
        System.out.println(result);
    }
}
