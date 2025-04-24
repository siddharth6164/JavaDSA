public class Question509 {
    public static int soulation1(int n){
        if(n==0||n==1){
            return n;
        }
        int sum = soulation1(n-1)+soulation1(n-2);
        return sum;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(soulation1(n));
    }
}
