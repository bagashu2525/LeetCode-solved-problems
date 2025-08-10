package GreedyAlgo;

import java.util.*;

public class FractionalKnapSack {

    public double fractionalKnapsack(int[] val, int[] wt, long cap) {
        // Your code goes here
        Item[] arr = new Item[val.length];
        for (int i = 0; i < val.length; i++) {
            arr[i] = new Item(val[i], wt[i]);
        }
        Arrays.sort(arr,new SortItems());
        double total=0.0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].wt<=cap){
                cap-=arr[i].wt;
                total+=arr[i].val;
            }
            else{
                total+= ((double)arr[i].val / (double)arr[i].wt) * (double)cap;
                break;
            }
        }
        return total;


    }
    public static void main(String[] args) {
        FractionalKnapSack knapsack = new FractionalKnapSack();
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        long cap = 50;
        double result = knapsack.fractionalKnapsack(val, wt, cap);
        System.out.println("Maximum value in Knapsack = " + result);
    }
}
class Item{
    int val;
    int wt;
    Item(int val,int wt){
        this.val=val;
        this.wt=wt;
    }
}
class SortItems implements Comparator<Item>{
    public int compare(Item a, Item b){
        double ans1 = (double) (a.val/a.wt);
        double ans2 = (double) (b.val/b.wt);
        if(ans1<ans2) return 1;
        else if(ans1==ans2) return 0;
        return -1;
    }
}