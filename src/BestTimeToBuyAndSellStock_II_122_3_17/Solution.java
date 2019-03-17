package BestTimeToBuyAndSellStock_II_122_3_17;

class Solution{
    /**
     * 解题思路
     * 将每个后一个比前一个大的组合，将后一个减去前一个的值加到总和当中
     * 
     */
    public int maxProfit(int[] prices){
        int total = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i+1]>prices[i])
                total += prices[i+1] -prices[i];
        }
        return total;
    }
}