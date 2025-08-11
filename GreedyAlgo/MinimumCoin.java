package GreedyAlgo;

import java.util.Arrays;

/*
 * Given an integer array of coins representing coins of different denominations and an integer amount representing a total amount of money. 
 * Return the fewest number of coins that are needed to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1. 
 * There are infinite numbers of coins of each type
 * 
 * Input: coins = [1, 2, 5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1. We need 3 coins to make up the amount 11.
 */
public class MinimumCoin {
public int findMax(int[] coins,int amount){
        int i=0;
        while(i<coins.length && coins[i]<=amount){
            i++;
        }
        if(i==coins.length || coins[i]>amount)
        {
            if(i!=0) 
                return coins[i-1];
        }
        return 0;
            
    }
    public int MinimumCoins(int[] coins, int amount) {
        Arrays.sort(coins);
        int min_coin=0,cap=amount;
        while(true){
            if(cap==0) return min_coin;
            int maxCoin=findMax(coins,cap);
            if(maxCoin>0){
                cap-=maxCoin;
                min_coin++;
            }
            else{
                break;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        MinimumCoin mc = new MinimumCoin();
        int[] coins = {1, 2, 5, 10, 20, 100, 500, 1000};
        int amount = 49;
        int result = mc.MinimumCoins(coins, amount);
        System.out.println("Minimum number of coins needed: " + result);
    }

}