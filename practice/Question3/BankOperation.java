import java.util.regex.*;

class Global{
    public static int bal=0 ;
}

public class BankOperation {
    static int processOperation(String strings){
        if(strings.contains("see")||strings.contains("show")){
            return Global.bal;
        }
        Pattern pattern = Pattern.compile("(\\b\\w+)\\s+(\\d+)");
        Matcher matcher = pattern.matcher(strings);
        while (matcher.find()) {
            String prev_word = matcher.group(1);
            int number = Integer.parseInt(matcher.group(2));
            if(prev_word.equals("deposit")||prev_word.equals("Deposit")||prev_word.equals("put")||prev_word.equals("invest")||prev_word.equals("transfer")){
                if(Global.bal==0){
                    Global.bal=number;
                }else{
                    Global.bal+=number;
                }
            }
            if(prev_word.equals("withdreaw")||prev_word.equals("pull")){
                Global.bal-=number;
            }
        }
        return Global.bal;
    }
        
        public static void main(String[] args) {
            String[] str = {"Deposit 2396", 
            "I want to transfer 3017 dollor to my account", 
            "I want to pull 2300 dollors",
            "I want to deposit 3980 dollors", 
            "I want to transfer 2811 dollors to my account" };
            for (String strings : str) {
                System.out.println((int)(processOperation(strings)));
        }    

    }
}