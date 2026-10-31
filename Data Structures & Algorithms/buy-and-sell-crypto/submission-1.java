class Solution {
    public int maxProfit(int[] prices) {
int maxProfit = 0;

        if (prices.length <= 1) {
            return 0;
        }

        int i = 0;
        while (i < prices.length - 1) {
            int j = i + 1;
            int currentProfit = 0;
            while (j < prices.length && prices[j] > prices[i]) {
                currentProfit = Math.max(prices[j] - prices[i], currentProfit);
                j++;
            }
            maxProfit = Math.max(currentProfit, maxProfit);
            i++;
        }

        return maxProfit;
    }
}
