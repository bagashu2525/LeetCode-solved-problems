public class LargestOdd {
    public String largestOddNumber(String num) {
        String n="";
        for(int i = num.length()-1;i>=0;i--){
            int digi = num.charAt(i)-'0';
            if(digi%2!=0){
                n = num.substring(0,i+1);
                //System.out.println(n);
                break;
            }
            //System.out.println(n);
        }
        //System.out.println(n);
        return n;
    }
}
