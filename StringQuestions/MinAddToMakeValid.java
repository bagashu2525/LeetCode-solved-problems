import java.util.Stack;

public class MinAddToMakeValid {
    public static void main(String [] args){
        String s="()))";
        int count=0;
        Stack<Character> st= new Stack<>();
        char[] ch= s.toCharArray();
        for(char c: ch){
            if(c=='(')
                st.push('(');
            else if(c==')'){
                if(!st.isEmpty())
                    st.pop();
                else
                    count++;
            }
        }
        if(!st.isEmpty()){
            count+=st.size();
        }
       
        System.out.println(count);

    }
}
