public class ReverseString{
    public static void main(String[] args){
        String s = "a good   example";
        s=s.trim();
        String [] arr = s.split(" ");
        for( String i : arr){
            if(i!="")
                System.out.println(i);
            
            
               
        }
        
    }
}