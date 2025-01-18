class Solution {
    public int maxProfit(int[] prices) {

        if (prices.length == 0) {
            return 0;
        } 
        int min = prices[0];
        int max = prices[0];
        int profit = 0;
        for (int i=1 ; i < prices.length ; i++) {
            if (min > prices[i]) {
                min = prices[i];
                max = 0;
            } else if (max < prices[i]) {
                max = prices[i];
            }
            
            
            profit = Math.max(max - min, profit);
            
        }
        System.out.printf("Min = %d and Max = %d", min, max);
        
        return profit;
        
    }
}