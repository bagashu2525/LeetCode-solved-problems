package GreedyAlgo;

/*
Problem 678: Valid Parenthesis String
 * Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.
 * The following rules define a valid string:
 *
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * Any right parenthesis ')' must have a corresponding left parenthesis '('.
 * Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
 */
/*
     * Keep track of:
     * Minimum possible open brackets minOpen
     * Maximum possible open brackets maxOpen
     * At each step:
     * If '(': both minOpen and maxOpen increase by 1.
     * If ')': both decrease by 1 (but minOpen can’t go below 0).
     * If '*': treat as either '(', ')', or empty → update range:
     * minOpen--, maxOpen++
     * If at any point maxOpen < 0 → invalid string.
     * At the end, if minOpen == 0, the string is valid.
     */
class Solution {
    boolean flag=false;
    public void fun(int ind,int open, String s){
        if(flag) return;
        if(ind==s.length()){
            if(open==0){
                flag=true;
            } 
            return;
        }
        char c = s.charAt(ind);
        if (c == '(') {
            fun(ind + 1, open + 1, s);
        } else if (c == ')') {
            if (open > 0) {
                fun(ind + 1, open - 1, s);
            }
        } else { // c == '*'
            // Treat '*' as '('
            fun(ind + 1, open + 1, s);
            // Treat '*' as ')'
            if (open > 0) fun(ind + 1, open - 1, s);
            // Treat '*' as empty
            fun(ind + 1, open, s);
        }
        
    }
    
    public boolean checkValidString(String s) {
        int open=0;
        fun(0,open,s);
        return flag;
    }
    //Alternative iterative solution
    
    public boolean checkValidString2(String s) {
        int minOpen = 0, maxOpen = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen = Math.max(0, minOpen - 1);
                maxOpen--;
            } else { // c == '*'
                minOpen = Math.max(0, minOpen - 1); // treat as ')'
                maxOpen++;                          // treat as '('
            }

            if (maxOpen < 0) return false; // Too many ')'
        }

        return minOpen == 0;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "(*))";
        boolean result = solution.checkValidString2(s);
        System.out.println("Is the string valid? " + result);
    }
}