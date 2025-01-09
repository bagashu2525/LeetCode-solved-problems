package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyLimit {
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        List<Integer> li = new ArrayList<>(Collections.nCopies(arr.length, 0));

        for(int i=0; i<arr.length; i++){
            //if(arr[i]>=1 && arr[i]<=arr.length){
                
                if(li.get(arr[i]-1)>0){

                    li.set(arr[i]-1,li.get(arr[i]-1)+1);
                }
                else{

                    li.set(arr[i]-1,1);
                }
                
            }
        //}
        return li;
    }
    public static void main(String[] args) {
        FrequencyLimit ob = new FrequencyLimit();
        int [] arr = {2,3,2,3,5};
        List<Integer> li = ob.frequencyCount(arr);
        for (Integer integer : li) {
            System.out.println(integer);
        }
    }

}
/*
 * 
 * The method Collections.nCopies(int n, T obj) is a utility in the Java Collections Framework that creates an immutable list containing n copies of the specified object obj.
 * It is useful for quickly initializing a list with repeated values.
 * 
 * public static <T> List<T> nCopies(int n, T obj)
 * n: The number of copies to include in the list.
 * obj: The object to be copied into the list.
 * Returns:
 * A fixed-size, immutable list containing n references to obj.
 */