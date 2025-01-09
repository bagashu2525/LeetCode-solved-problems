public class CheckPalindrome {
    public static boolean isPalindrome(String s) {
        // String result = s.replaceAll("[^a-zA-Z0-9]","");
        // StringBuffer sb = new StringBuffer(result);
        // String s1= new String(sb.reverse());
        // if(result.equalsIgnoreCase(s1)){
        //     return true;
        // }
        // return false;
        String result = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(result);
        String sb="";
        for(int i=0;i<result.length();i++){
            sb=result.charAt(i)+sb;
        }
        System.out.println(sb);
        if(result.equalsIgnoreCase(sb)){
            return true;
        }
        return false;
    }
    public static void main(String []args){
        String s = "Marge, let's \\\"[went].\\\" I await {news} telegram.";
        System.out.println(isPalindrome(s));
    }
}
