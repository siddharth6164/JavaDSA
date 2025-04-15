// 121. Best Time to Buy and Sell Stock
public class Question121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int buyprices = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            // buy the product in lowest price
            if(buyprices>prices[i]){
                buyprices=prices[i];
            }
            profit = Math.max(profit,prices[i]-buyprices);
        }
        System.out.println(profit);
    }
}