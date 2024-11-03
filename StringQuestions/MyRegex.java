import java.util.Scanner;

public class MyRegex {
    public static boolean checkIP(String pattern){
        String[] arr = pattern.split("\\.");
        System.out.println(arr.length);
        if(arr.length!=4){
            return false;
        }
        else{
            for(String a: arr){
                if(a.length()==0 || a.length() >3)
                    return false;
                else{
                    try {
                        int num=Integer.parseInt(a);
                        if(num<0 || num>255)
                            return false;
                        if(a.length()>1 && a.startsWith("0"))
                            return false;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String pattern = scanner.nextLine();
        scanner.close();
        System.out.println(checkIP(pattern));
        
    }
}

