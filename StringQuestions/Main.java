import java.util.HashMap;
import java.util.Map;
public class Main {
    public static char[] sort(int[] a, char[] c){
        for(int i=0; i< a.length; i++){
            for(int j=0; j<a.length-i-1; j++){
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                    char ch=c[j];
                    c[j]=c[j+1];
                    c[j+1]=ch;
                }

            }
           
        }
        
        return c;
    }
    public static void main(String []args){
        String s="cccaaa";
        HashMap<Character,Integer> hmp= new HashMap<>();
        char[] arr= s.toCharArray();
        for(int i =0 ; i<s.length(); i++){
            if(hmp.containsKey(arr[i]))
                hmp.put(arr[i],hmp.get(arr[i])+1);
            else
                hmp.put(arr[i],1);
        }
        for(Map.Entry<Character,Integer> e : hmp.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println(hmp.size());
        int[] a = new int[hmp.size()];
        char[] c = new char[hmp.size()];
        int i=0;
        for(Map.Entry<Character,Integer> e : hmp.entrySet()){
            a[i]=e.getValue();
            c[i]=e.getKey();
            System.out.println(a[i]);
            i++;
        }
        c=sort(a,c);
        // for(char val: c){
        //      System.out.print(val);
        // }
        String snew="";
        for(char ch: c){
            for(int j=0; j<hmp.get(ch); j++){
                snew+=ch;
            }
        }
        System.out.println(snew);
    }
}
