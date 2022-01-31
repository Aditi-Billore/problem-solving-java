package arrayRelated;

/*
 * You are given an integer array prices where 
 * prices[i] is the price of a given stock on the ith day.
 * 
 * On each day, you may decide to buy and/or sell the stock. 
 * You can only hold at most one share of the stock at any time. 
 * However, you can buy it then immediately sell it on the same day.
 * 
 * Find and return the maximum profit you can achieve.
 * 
 */
public class StockBuySell {

	public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        for(int i=1;i<prices.length; i++) {
        	if(prices[i-1]<prices[i]) {
        		totalProfit += (prices[i] - prices[i-1]);
        	}
        }
        return totalProfit;
    }
	public static void main(String[] args) {
		
		int[] nums = {5,2,7,3,6,1,2,4};
		System.out.println(maxProfit(nums));
	}
	
}
