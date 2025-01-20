import java.util.ArrayList;

public class Factorial {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> arlist = new ArrayList<>();
        long val=1l;
        for(long i=1l;i<=n;i++){
            val=i*val;
            if(1l<=val && val<=n){
                arlist.add(val);
            }
            if(val>n) break; 
        }
        return arlist;
    }
    public static void main(String[] args) {
        ArrayList<Long> arlist= factorialNumbers(1);
        for (Long long1 : arlist) {
            System.out.println(long1);
        }
    }
}
