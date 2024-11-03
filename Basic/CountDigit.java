/*
 * 
 * Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.

Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.
 */

import java.util.Scanner;

public class CountDigit {
    public static int solution(int n){
        int count=0;
        int nn=n;
        while(nn>0){
            int r=nn%10;
            if(n%r==0){
                count++;
            }
            nn=nn/10;
        }
        return count;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.err.println(solution(n));
        sc.close();
    }
}
