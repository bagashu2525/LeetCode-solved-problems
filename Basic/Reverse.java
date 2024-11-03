import java.util.Scanner;

public class Reverse {
    public static int reverse(int x) {
        int nn=x;
        int m=0;
        if (x<0) nn=nn*-1;
        while(nn>0){
            int r = nn%10;
            // Check for overflow before updating m
            if (m > Integer.MAX_VALUE / 10 || (m == Integer.MAX_VALUE / 10 && r > 7)) {
                return 0; // Overflow condition for positive numbers
            }
            m=m*10+r;
            nn=nn/10;
        }
        if (x<0) m=m*-1;
        
        return m;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println(reverse(n));

        sc.close();
    }
} 
    

