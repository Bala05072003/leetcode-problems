class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int maxprofit=0;
        int profit=0;
        for(int r=1;r<prices.length;r++){
            profit=prices[r]-prices[l];
            if(prices[r]-prices[l]<0){
                l=r;
            }
            maxprofit=Math.max(profit,maxprofit);

        }
        return maxprofit;
    }
}