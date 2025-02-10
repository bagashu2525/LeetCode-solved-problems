package potd;

import java.util.Stack;
public class ClearDigit {
    public String clearDigits(String s) {
        // Create a new stack
        Stack<Character> snew = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                snew.push(s.charAt(i));
            }
            else{
                if(!snew.isEmpty()){
                    snew.pop();
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while(!snew.isEmpty()){
            res.append(snew.pop());
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        ClearDigit ob = new ClearDigit();
        System.out.println(ob.clearDigits("ab34"));
    }
}
