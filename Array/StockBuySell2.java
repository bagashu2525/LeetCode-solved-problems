public class StockBuySell2 {
    public int maxProfit(int[] prices) {
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
        StockBuySell2 ob = new StockBuySell2();
        int[] price = {7,1,5,3,6,4};
        System.out.println(ob.maxProfit(price));
    }
}
