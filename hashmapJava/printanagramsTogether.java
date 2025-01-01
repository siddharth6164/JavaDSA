package hashmapJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class printanagramsTogether {
    public static void main(String[] args) {
        String[] arr = { "act", "god", "cat", "dog", "tac" };
        HashMap<String, List<String>> dic = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            char[] tmp = arr[i].toCharArray();
            Arrays.sort(tmp);
            String tempString = new String(tmp);
            if(dic.containsKey(tmp)){
                List<String> anagrams = dic.get(tmp);
                anagrams.add(arr[i]);
                dic.put(tempString, anagrams);
            }else{
                List<String> anagrams = new ArrayList<>();
                anagrams.add(arr[i]);
                dic.put(tempString, anagrams);
            }
            List<List<String>> result = new ArrayList<>();
            for(String s: dic.keySet()){
                result.add(dic.get(s));
            }
            System.out.println(result);
        }
    }
}
