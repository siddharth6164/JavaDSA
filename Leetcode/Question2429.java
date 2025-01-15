// Leetcode
// 2429. Minimize XOR
public class Question2429 {

    public static int minimizeXor(int num1, int num2) {
        int count = Integer.bitCount(num2); 
        int res = 0;

        // Cancel set bits from highest to lowest weight
        for (int i = 31; i >= 0 && count > 0; i--) {
            if ((num1 & (1 << i)) != 0) {
                count--;
                res += (1 << i);
            }
        }

        // Set bits lowest to highest weight
        for (int i = 0; i < 32 && count > 0; i++) {
            if ((num1 & (1 << i)) == 0) {
                count--;
                res += (1 << i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int num1=3;
        int num2=5;
        int ans = minimizeXor(num1, num2);
        System.out.println(ans);
    }
}