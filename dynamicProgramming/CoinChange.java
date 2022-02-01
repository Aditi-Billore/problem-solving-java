package dynamicProgramming;

import java.util.Arrays;

public class CoinChange {

	public static int minCoins(int totalAmount, int coins[], int dp[]) {
		if(totalAmount == 0)
			return 0;
		int ans = Integer.MAX_VALUE;
		int SubAns;
		for(int i =0;i< coins.length; i++) {
			if(totalAmount - coins[i] >= 0)
			{
				if(dp [totalAmount - coins[i]] != -1) {
					SubAns = dp [totalAmount - coins[i]];					
				}
				else {
					SubAns = minCoins(totalAmount - coins[i], coins, dp);
					dp [totalAmount - coins[i]] = SubAns;
				}
				
				if( SubAns!= Integer.MAX_VALUE &&  SubAns + 1 < ans) {
					ans = SubAns +1 ;
				}
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int[] coins = {1,5,7};
		int totalAmount = 18;
		
		int[] dp = new int[totalAmount + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		System.out.println(minCoins(totalAmount, coins, dp));
	}

}
