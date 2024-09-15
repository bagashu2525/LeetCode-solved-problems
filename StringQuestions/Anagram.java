import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagarbm";
        int flag=1;
         if(s.length()==t.length()){
            char []chs = s.toCharArray();
            char []cht = t.toCharArray();
            Arrays.sort(chs);
            Arrays.sort(cht);
            for(int i = 0 ; i<s.length(); i++){
                if(chs[i]!=cht[i]){
                    System.out.println("They are not anagram");
                    flag=0;
                }
                    

            }
            if(flag==1)
                System.out.println("They are anagram");
        }
        else
        System.out.println("They are not anagram");
    }
}
