public class Question3174 {
    public static String clearDigits(String s) {
        StringBuilder res = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c >= '0' && c <= '9'){
                if(res.length() > 0){
                    res.deleteCharAt(res.length() -1);
                }
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s ="cb34";
        String res = clearDigits(s);
        System.out.println(res);
    }
}