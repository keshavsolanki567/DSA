package array;

public class StockBuySell {
    public static void main(String[] args) {
        int arr[] ={7,1,5,3,6,4};
        int profit = maxProfit(arr);
        System.out.println(" Max Profit is  " + profit);
    }
    public static int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=0; i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];

            }
            if(profit<prices[i]-min){
                profit=prices[i]-min;
            }
            
        }
        return profit;
    }
}
