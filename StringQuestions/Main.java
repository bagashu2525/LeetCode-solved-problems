import java.util.Arrays;

public class Main {
    
    public static void main(String []args){
        String s="ccbcaaa";
        char []ch = s.toCharArray();
        Arrays.sort(ch);
        for(char a : ch)
            System.out.print(a);
    }
}
