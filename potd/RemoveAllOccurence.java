package potd;

public class RemoveAllOccurence {
    
        public static void calculateLPS(String part, int[] lps){
            int n= part.length();
            int i=0,j=1;
            lps[0]=0;
            
            while(j<n){
                // System.out.println("hi");
                if(part.charAt(i)==part.charAt(j)){
                    lps[j]=i+1;
                    i++; j++;
                }
                else{
                    if(i>0) 
                        i=lps[i-1];
                    else{
                        lps[j]=0;j++;
                    }
                        
                }
            }
        }
        public static void removeOccurrences(String s, String part) {
            int m = s.length();
            int n = part.length();
            int i=0,j=0;
    
            int[] lps = new int[n];
            calculateLPS(part,lps);

            StringBuilder sb= new StringBuilder(s);
            while(i<sb.length()){
                // System.out.println("hu");
                if(sb.charAt(i)==part.charAt(j)){
                    i++;j++;
                
                if(j==n){
                    sb=sb.delete(i-n, i);
                    i=Math.max(0,i-2*n);
                    j=0;
                }
            }
                else{
                    if (j > 0) {
                        j = lps[j - 1]; // Use LPS to skip unnecessary comparisons
                    } else {
                        i++;
                    }
                }
            }
            System.out.println(sb.toString());
        }                                   
    
    public static void main(String[] args) {
        removeOccurrences("daabcbaabcbc","abc");
    }
}
