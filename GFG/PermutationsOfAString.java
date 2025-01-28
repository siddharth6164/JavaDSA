// GFG
// Permutation Of A String
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PermutationsOfAString {
    public ArrayList<String> findPermutation(String s) {
        Set<String> ans = new HashSet<>();
        boolean[] visit = new boolean[s.length()];
        makePermutation(s,ans,"", visit);
                return new ArrayList<>(ans);
            }
            
        static void makePermutation(String s, Set<String> ans, String curr, boolean[] visit) {
                if(curr.length() == s.length()){
                    ans.add(curr);
                    return;
                }
                for(int i=0;i<s.length();i++){
                    if(!visit[i]){
                        visit[i]=true;
                        makePermutation(s, ans, curr+s.charAt(i), visit);
                        visit[i] = false;
                    }
                }
            }
        
        
    public static void main(String[] args) {
        String s = "ABC";
        PermutationsOfAString obj = new PermutationsOfAString();
        ArrayList<String> output = obj.findPermutation(s);
        
        for(String perm : output) {
            System.out.println(perm);
        }
    }
}