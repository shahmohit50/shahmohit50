package assignment;

public class Buy_Sell_Stock {
	public static void main(String[] args) {
//		int prices[]= {7,1,5,3,6,4};
		int prices[] = {7,6,4,3,1};
		int maxProfit = 0;
		
		int i=0,j=0;
		for(;i < prices.length-1;i++) {
			for( j=i+1;j<prices.length;j++) {
				if(prices[i] <= prices[j] && maxProfit < (prices[j] - prices[i] )) {
					maxProfit = prices[j] - prices[i];
				}
			}

		}
		System.out.println(maxProfit);
		
	}
}
