package potd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CompletelyPaintedRowColumn {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int ans=-1;
        HashMap<Integer,List<Integer>> mp = new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                List<Integer> numberList = Arrays.asList(i,j);
                mp.put(mat[i][j], numberList);
            }
        }
        //System.out.println(mp);
        List<Integer> row = new ArrayList<>(Collections.nCopies(mat.length, 0));
        List<Integer> col = new ArrayList<>(Collections.nCopies(mat[0].length,0));
        for(int i=0; i<arr.length;i++){
            
            int key = i;
            List<Integer> li = mp.get(arr[i]);
            int r = li.get(0);
            int c = li.get(1);
            row.set(r,row.get(r)+1);
            col.set(c,col.get(c)+1);
            if(row.contains(mat[0].length)||col.contains(mat.length)){
                ans=key;
                break;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,8,7,4,1,3,5,6,9};
        int[][] mat={{3,2,5},{1,4,6},{8,7,9}};
        CompletelyPaintedRowColumn ob= new CompletelyPaintedRowColumn();
        System.out.println(ob.firstCompleteIndex(arr, mat));

    }
}
