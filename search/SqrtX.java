public class SqrtX {
    public static int mySqrt(int x) {
        int l=1;int h=x;
        int mid=-1;
        while(l<=h){
            mid=(l+h)/2;
            if(mid*mid==x)
                return mid;
            if((mid*mid)>x)
                h=mid-1;
            else
                l=mid+1;
        }
        if((mid*mid)<=x) return mid;
    }
    public static void main(String[] args) {
        SqrtX.mySqrt(8);
    }
}
