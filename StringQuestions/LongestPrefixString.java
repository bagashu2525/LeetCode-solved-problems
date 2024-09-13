public class LongestPrefixString {
    public String longestCommonPrefix(String[] strs) {
        String prefix="";
        int flag=1;
        for(int i=0; i<strs[0].length(); i++){
            char a= strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(strs[j].length()>i){
                    if(a!=strs[j].charAt(i))
                        flag=0;
                    
                }
                else flag=0;
                
            }
            
            if(flag!=0){
                prefix+=a;
            }
            else{
                break;
            }
        }
        return prefix;
    }
}
