class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        
        int l=prices.length;
        
        int prof=0;
        for(int i=0;i<l;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];

            }
            else if(prices[i]-min>prof)
            {
                prof=prices[i]-min;
            }
        }
        
        
        if(prof>0)
        {
            return prof;
        }
        else{
            return 0;
        }

    }
}