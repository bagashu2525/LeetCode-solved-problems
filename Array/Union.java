import java.util.ArrayList;
import java.util.TreeSet;

public class Union {

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> li = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                if (!li.contains(a[i]))
                    li.add(a[i]);
                i++;
            } else {
                if (!li.contains(b[j]))
                    li.add(b[j]);
                j++;
            }
        }
        while (i < a.length) {
            if (!li.contains(a[i]))
                li.add(a[i]);
            i++;
        }
        while (j < b.length) {
            if (!li.contains(b[j]))
                li.add(b[j]);
            j++;
        }
        return li;
    }

    /*
     * the above solution is slow
     * The use of li.contains() in each iteration makes it O(n²) in the worst case.
     * Since the arrays are already sorted, we can optimize it by avoiding
     * contains() and using a lastAdded tracker.
     */

     public static ArrayList<Integer> findUnion1(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> li = new ArrayList<>();
        int i=0,j=0;
        int lastadded=Integer.MIN_VALUE;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                if(lastadded!=a[i]){
                    li.add(a[i]);
                    lastadded=a[i];
                }
                    
                i++;
            }
            else{
                if(lastadded!=b[j]){
                    li.add(b[j]);
                    lastadded=b[j];
                }
                    
                j++;
            }
        }
        while(i<a.length){
            if(!li.contains(a[i]))
                    li.add(a[i]);
            i++;
        }
        while(j<b.length){
            if(!li.contains(b[j]))
                    li.add(b[j]);
            j++;
        }
        return li;
    }
    
    /*
     * So here we use lastadded variable
     */

    public static ArrayList<Integer> findUnion2(int a[], int b[]) {
        // add your code here
        
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : a) set.add(num);
        for (int num : b) set.add(num);
        return new ArrayList<>(set);
    }
    /*
     * Using TreeSet
     */

    public static void main(String[] args) {
        int a[] = { 1, 2, 2, 3, 4, 5 };
        int b[] = { 2, 3, 5, 6 };

        System.out.println(Union.findUnion(a, b));
    }
}
