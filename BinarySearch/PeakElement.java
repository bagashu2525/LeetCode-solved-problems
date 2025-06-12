/*
Problem : 1901
A peak element in a 2D grid is an element that is strictly greater than all of its adjacent neighbors to the left, right, top, and bottom.

Given a 0-indexed m x n matrix mat where no two adjacent cells are equal, find any peak element mat[i][j] and return the length 2 array [i,j].

You may assume that the entire matrix is surrounded by an outer perimeter with the value -1 in each cell.

You must write an algorithm that runs in O(m log(n)) or O(n log(m)) time. */
class PeakElement{
    
    public static int[] findPeakGrid(int[][] mat) {
        //solution one brute force
        int row = mat.length;
        int col = mat[0].length;
        int[] arr = new int[2];
        int down=-1,up=-1,left=-1,right=-1;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==0 || i==row-1 || j==0 || j==col-1){
                    if(i+1>=row ) down=-1; else down=mat[i+1][j];
                    if(j+1>=col) right=-1; else right=mat[i][j+1];
                    if(j-1<0) left=-1; else left=mat[i][j-1];
                    if(i-1<0) up=-1; else up=mat[i-1][j];
                    if(i==0 && j==0 ){
                        
                        if(mat[i][j]> down && mat[i][j]> right){
                            arr[0]=i;
                            arr[1]=j;
                        }
                    }
                    else if(i==0 && j==col-1){
                        
                        if(mat[i][j]> down && mat[i][j]> left){
                            arr[0]=i;
                            arr[1]=j;
                        }
                    }
                    else if(i==row-1 && j==0){
                        
                        if(mat[i][j]> up && mat[i][j]> right){
                            arr[0]=i;
                            arr[1]=j;
                        }
                    }
                    else if(i==row-1 && j==col-1){

                        if(mat[i][j]> up && mat[i][j]> left){
                            arr[0]=i;
                            arr[1]=j;
                        }
                    }
                    else if(i==0){

                        if(mat[i][j]> down && mat[i][j]> left && mat[i][j]> right){
                            arr[0]=i;
                            arr[1]=j;
                        }
                    }
                    else if(i==row-1){
                        if(mat[i][j]> up && mat[i][j]> left && mat[i][j]> right){
                            arr[0]=i;
                            arr[1]=j;
                        }
                    }
                    else if(j==0){
                        if(mat[i][j]> up && mat[i][j]> down && mat[i][j]> right){
                            arr[0]=i;
                            arr[1]=j;
                        }
                    }
                    else if(j==col-1){
                        if(mat[i][j]> up && mat[i][j]> down && mat[i][j]> left){
                            arr[0]=i;
                            arr[1]=j;
                        }
                    }
                }
                else{
                    if(mat[i][j]> mat[i-1][j] && mat[i][j]> mat[i+1][j] && mat[i][j]> mat[i][j-1] && mat[i][j]> mat[i][j+1]){
                        arr[0]=i;
                        arr[1]=j;
                    }
                }
                    
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int[][] mat = {
            {1,4},{3,2}
        };
        System.out.println(findPeakGrid(mat)[0] + " " + findPeakGrid(mat)[1]); // Output: 2 2 (or any peak element)
    }
}