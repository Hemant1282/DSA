import java.util.*;

public class BuyAndSellStock {

    public static int Buy_And_SellStock(int prices[]){
        int buying_price = prices[0];
        int profit = Integer.MIN_VALUE;
        for(int i = 1;i<prices.length;i++){
            if(buying_price>=prices[i]){
                buying_price = prices[i];
                i++;
            }
            //calculate profit
            int curr_profit = prices[i] - buying_price;
            profit = Math.max(curr_profit,profit);
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int profit = Buy_And_SellStock(prices);
        System.out.println(profit);
    }
}
