package BestTimeToBuyAndSellStock_121_3_17;

class Solution {
    public int maxProfit(int[] prices){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length;i++){
            minPrice = Math.min(minPrice, prices[i]);//找到当前时刻的最小值
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);//使用当前最大值减去当前最小值
        }
        return maxProfit;
    }
}