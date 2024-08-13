import java.util.ArrayList;

public class SetMatrixZero {
    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<Integer>();
        ArrayList<Integer> col = new ArrayList<Integer>();

        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int r:row){
            for(int i = 0;i<matrix[0].length;i++){
                matrix[r][i]=0;
            }
        }
        for(int c:col){
            for(int i = 0;i<matrix.length;i++){
                matrix[i][c]=0;
            }
        }
    }
    public static void main(String[] args) {
        
        //Matrix initialization.
        int[][] mat = {{0,1,2,0},
                       {3,4,5,2},
                       {1,3,1,5}};
        
        setZeroes(mat);

        for(int i = 0;i<mat.length;i++){
            for(int j=0;j<mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}
