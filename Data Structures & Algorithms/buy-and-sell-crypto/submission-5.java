class Solution {
    public int maxProfit(int[] prices) {
        int lPointer = 0;
        int rPointer = 1;

        int maxPrice = 0;

        while (rPointer < prices.length) {
            if (prices[lPointer] <= prices[rPointer]) {
                int diff = prices[rPointer] - prices[lPointer];
                if (diff > maxPrice) {
                    maxPrice = diff;
                }
                rPointer++;
            } else if (prices[lPointer] > prices[rPointer]) {
                lPointer = rPointer;
                rPointer++;
            }
        }
        return maxPrice;
    }
}
