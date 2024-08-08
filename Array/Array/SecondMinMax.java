package Array;
import java.util.Scanner;
public class SecondMinMax {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int[] arr= new int[2];
        int secondmax=0,max=0;
        int secondmin=900000000,min=900000000;
        for(int i=0;i<n;i++){
            if(max<a[i] || secondmax<a[i] ){
                if(max<a[i]){
                    secondmax=max;
                    max=a[i];
                }
                else if(secondmax<a[i] && a[i]<max){
                    secondmax=a[i];
                }
                
            }
            if(min>a[i] || secondmin>a[i] ){
                if(min>a[i]){
                    secondmin=min;
                    min=a[i];
                }
                else if(secondmin>a[i] && a[i]>min){
                    secondmin=a[i];
                }
                
            }
        }
        arr[0]=secondmax;
        arr[1]=secondmin;
        return arr;
    }
    public static void main(String[] args){
        int[] a=new int[5];
        int[] p=new int[2];
        Scanner sc= new Scanner(System.in);
        for(int i = 0; i<5; i++){
            a[i]=sc.nextInt();
        }
        p=getSecondOrderElements(5,a);
        System.out.println(p[0]+" "+p[1]);
        sc.close();
    }
}