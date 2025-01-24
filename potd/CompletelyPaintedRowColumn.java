package potd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompletelyPaintedRowColumn {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int ans=-1;
        // HashMap<Integer,List<Integer>> mp = new HashMap<>();
        // for(int i=0;i<mat.length;i++){
        //     for(int j=0;j<mat[0].length;j++){
        //         List<Integer> numberList = Arrays.asList(i,j);
        //         mp.put(mat[i][j], numberList);

        //     }
        // }
        // //System.out.println(mp);
        // List<Integer> row = new ArrayList<>(Collections.nCopies(mat.length, 0));
        // List<Integer> col = new ArrayList<>(Collections.nCopies(mat[0].length,0));
        // for(int i=0; i<arr.length;i++){
            
        //     int key = i;
        //     List<Integer> li = mp.get(arr[i]);
        //     int r = li.get(0);
        //     int c = li.get(1);
        //     row.set(r,row.get(r)+1);
        //     col.set(c,col.get(c)+1);
        //     if(row.contains(mat[0].length)||col.contains(mat.length)){
        //         ans=key;
        //         break;
        //     }
        // }


        //HashMap<Integer,List<Integer>> mp = new HashMap<>();
        // int[][] mp = new int[(mat.length)*(mat[0].length)+1][2];
        // for(int i=0;i<mat.length;i++){
        //     for(int j=0;j<mat[0].length;j++){
        //         mp[mat[i][j]][0]=i;
        //         mp[mat[i][j]][1]=j;
        //         //System.out.println(mat[i][j]);

        //     }
        // }
        // //System.out.println(mp);
        // List<Integer> row = new ArrayList<>(Collections.nCopies(mat.length, 0));
        // List<Integer> col = new ArrayList<>(Collections.nCopies(mat[0].length,0));
        // for(int i=0; i<arr.length;i++){
            
        //     int key = i;
        //     int[] li = mp[arr[i]];
        //     int r = li[0];
        //     int c = li[1];
        //     row.set(r,row.get(r)+1);
        //     col.set(c,col.get(c)+1);
        //     if(row.contains(mat[0].length)||col.contains(mat.length)){
        //         ans=key;
        //         break;
        //     }
        // }
        // return ans;
        
            Map<Integer, Integer> numToIndex = new HashMap<Integer, Integer>();
             for (int i = 0; i < arr.length; i++) {
                 numToIndex.put(arr[i], i);
             }
     
             int result = Integer.MAX_VALUE;
             int numRows = mat.length;
             int numCols = mat[0].length;
     
             for (int row = 0; row < numRows; row++) {
                 int lastElementIndex = Integer.MIN_VALUE;
                 for (int col = 0; col < numCols; col++) {
                     int indexVal = numToIndex.get(mat[row][col]);
                     lastElementIndex = Math.max(lastElementIndex, indexVal);
                 }
                 result = Math.min(result, lastElementIndex);
             }
             for (int col = 0; col < numCols; col++) {
                 int lastElementIndex = Integer.MIN_VALUE;
                 for (int row = 0; row < numRows; row++) {
                     int indexVal = numToIndex.get(mat[row][col]);
                     lastElementIndex = Math.max(lastElementIndex, indexVal);
                 }
                 result = Math.min(result, lastElementIndex);
             }
             return result;
         
    }
    public static void main(String[] args) {
        int[] arr={2,8,7,4,1,3,5,6,9};
        int[][] mat={{3,2,5},{1,4,6},{8,7,9}};
        CompletelyPaintedRowColumn ob= new CompletelyPaintedRowColumn();
        System.out.println(ob.firstCompleteIndex(arr, mat));

    }
}
