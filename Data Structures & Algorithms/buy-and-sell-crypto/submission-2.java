class Solution {
    public int maxProfit(int[] prices) {
        
        int first = 0;
        int second = 1;
        int maxProfit = 0;
        while(first < prices.length){

            if(second == prices.length){
                first++;
                second = first+1;
                continue;
            }

            int profit = prices[second] - prices[first] ;

            if(profit > maxProfit){
                maxProfit = profit;
            }

            if(profit < 0){
                first++;
                second = first+1;
            }
            else{
                second++;
            }
        }

        return maxProfit;
    }
}
