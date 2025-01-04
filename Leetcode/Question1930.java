import java.util.HashSet;
import java.util.Set;

public class Question1930 {
    public static void main(String[] args) {
        String s = "aabca";
        int n = s.length();
        Set<Character> set = new HashSet<>();
        for(Character c : s.toCharArray()){
            set.add(c);
        }
        int ans = 0;
        for(Character st : set){
            int left=-1;
            int right=-1;
            for(int i = 0; i < n; i++){
                if(s.charAt(i)==st){
                    if(left==-1){
                        left = i;
                    }
                    right = i;
                }
            }
            Set<Character> between = new HashSet<>();
            for(int k = left+1;k < right;k++){
                between.add(s.charAt(k));
            }
            ans+=between.size();
        }
        System.out.println(ans);

    }
}
