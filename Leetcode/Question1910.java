import java.util.Arrays;

public class Question1910 {
    private static void calculateLPS(String part,int n,int[] lps){
        int i =0;
        int j =1;

        while(j<n){
            if(part.charAt(i) == part.charAt(j)){
                lps[j] = i+1;
                i++;
                j++;
            }else{
                if(i > 0){
                    i = lps[i-1];
                }else{
                    j++;
                }
            }
        }
    } 

    private static void removeSubStrings(StringBuilder s, String part, int[]lps){
        int m = s.length();
        int n = part.length();
        int i =0,j =0;

        while(i<m){
            if(s.charAt(i) == part.charAt(j)){
                i++;
                j++;
            }if(j ==n){
                s.delete(i-n, i);
                m = s.length();
                i = Math.max(0, i-2*n);
                j=0;
            }
            if(i<m && s.charAt(i) != part.charAt(j)){
                if(j==0){
                    i++;
                }else{
                    j=lps[j-1];
                }
            }
        }
    }

    public static String remoceOccurrence(String s, String part){
        int n = part.length();
        int[] lps = new int[n];
        Arrays.fill(lps,0);
        
        calculateLPS(part,n,lps);
        StringBuilder sb = new StringBuilder(s);
        removeSubStrings(sb,part,lps);

        return sb.toString();

    }
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";

        String res = remoceOccurrence(s, part);
        System.out.println(res);
    }
}