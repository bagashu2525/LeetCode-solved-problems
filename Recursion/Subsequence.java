package Recursion;

import java.util.Stack;

public class Subsequence {
    public static void printSubswquence(int index, Stack<Integer> ds, int []arr, int n){
        if(index==n){
            System.out.print("[");
            for(int s: ds)
                System.out.print(s+" ");
            System.out.print("]");
            return;
        }
        printSubswquence(index+1,ds,arr,n);
        ds.push(arr[index]);

        printSubswquence(index+1,ds,arr,n);
        ds.pop();
    }
    public static void main(String[] args){
        int[] arr = {3,2,1};
        Stack<Integer> ds = new Stack<>();
        printSubswquence(0,ds,arr,arr.length);
    }
}
