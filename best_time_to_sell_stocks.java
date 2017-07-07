public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        int min = prices[0];
        int max_so_far =0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>min)
                max_so_far = Math.max(prices[i]-min,max_so_far);
            else
                min = prices[i];
        }
        return max_so_far;
    }
}