class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int maxProfit = 0;

        while(j < prices.length ) {
            int profit = prices[j] - prices[i];
             if(maxProfit < Math.max(maxProfit, profit)) {
                maxProfit = Math.max(maxProfit, profit);
             }
             if(prices[j] < prices[i]) {
                i = j;
             }
             j++;
        }


        return maxProfit;
    }
}