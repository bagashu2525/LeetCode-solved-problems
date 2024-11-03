package potd;
/*
 * 
 * Given two positive integers n and k, the binary string Sn is formed as follows:

S1 = "0"
Si = Si - 1 + "1" + reverse(invert(Si - 1)) for i > 1
Where + denotes the concatenation operation, reverse(x) returns the reversed string x, and invert(x) inverts all the bits in x (0 changes to 1 and 1 changes to 0).

For example, the first four strings in the above sequence are:

S1 = "0"
S2 = "011"
S3 = "0111001"
S4 = "011100110110001"
Return the kth bit in Sn. It is guaranteed that k is valid for the given n.

 */
public class FindKthOfNth {
    public String invert(String s){
        String snew="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0') snew=1+snew;
            else snew=0+snew;
        }
        return snew;
    }
    public StringBuffer reverse(String s){
        StringBuffer sbr = new StringBuffer(s);
        sbr.reverse();
        return sbr;
        
    }
    public String fun(int n){
        if(n==1)
            return "0";
        String s = fun(n-1);
        return s+"1"+invert(s);
    }
    
    public static void main(String[] args){
        FindKthOfNth fkn = new FindKthOfNth();
        System.out.println(fkn.fun(5));;

    }
}
