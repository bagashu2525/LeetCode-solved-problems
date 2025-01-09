public class StockBuySell {
    //bruteforce solution
    public static int profit(int[] prices){
        int buy;
        int buyMin=0;
        int sellMax=Integer.MIN_VALUE;
        int sell=0;
        int profit=0;

        for(int i=0; i<prices.length; i++){
            buy=prices[i];
            System.out.println(buy);
            //findMax
            for(int j=i+1;j<prices.length;j++){
                sell=prices[j];
                if(sell>buy){
                    if((sellMax-buyMin)<=(sell-buy)){
                        
                        sellMax=sell;
                        buyMin=buy;
                        
                    }
                }
            }
            if(sellMax>Integer.MIN_VALUE){
                if(profit<(sellMax-buyMin)){
                    profit=sellMax-buyMin;
                    //System.out.println(sellMax+" "+buyMin);
                }
                    
            }

        }
        return profit;
        
    }

    //optimal solution
    public static int profit2(int[] prices){
        int min=prices[0];
        int max=0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]<min)
                min=prices[i];
            if((prices[i]-min)>max)
                max=prices[i]-min;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] prices={2,4,1};
        System.out.println("profit="+profit2(prices));
    }
}


