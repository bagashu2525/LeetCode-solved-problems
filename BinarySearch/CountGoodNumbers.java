public class CountGoodNumbers {
    public long modPow(long num, long e){
        if(e==0) return 1;
        if(e==1) return num;
        if(e<0) return 0;
        long mod = 1000000007;
        long res = num;
        e-=1;
        while(e>0){
            res=(res*num) % mod;
            e--;
        }
        return res;
    }
    public int countGoodNumbers(long n) {
        long mod = 1000000007; 
        long e = (int) (n+1)/2;
        long o = (int) n/2 ;
        return  (int) ((modPow(5, e) * modPow(4, o)) % mod);
        
       
    }
    public static void main(String[] args) {
        CountGoodNumbers obj = new CountGoodNumbers();
        System.out.println(obj.countGoodNumbers(1)); // Output: 5
        System.out.println(obj.countGoodNumbers(4)); // Output: 400
        System.out.println(obj.countGoodNumbers(50)); // Output: 564908303
        System.out.println(obj.countGoodNumbers(806166225460393L)); // Output: 643535977
    }

}
