import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    public static void main(String[] args) {
        Reverse ob=new Reverse();
        int []arr = {1,3,4,5,2};
        ob.reverseArray(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
