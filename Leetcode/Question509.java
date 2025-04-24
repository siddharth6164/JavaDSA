// 509. Fibonacci Number
public class Question509 {
    public static int soulation2(int n){
        if(n==0|| n==1){
            return n;
        }
        int [] data = new int[n+1];
        data[0] = 0;
        data[1] = 1;
        for(int i=2;i<=n;i++){
            data[i] = data[i-1] + data[i-2];
        }
        return data[n];
    }
    public static int soulation1(int n){
        if(n==0||n==1){
            return n;
        }
        int sum = soulation1(n-1)+soulation1(n-2);
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(soulation1(n));
        // O(n)
        System.out.println(soulation2(n));

    }
}
