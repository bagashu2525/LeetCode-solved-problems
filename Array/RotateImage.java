

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int[][] newmatrix = new int [matrix.length][matrix.length];
        int l;
        for(int i = 0; i<matrix.length; i++){
            l=matrix.length-1;
            for(int j = 0; j<matrix.length; j++){
                newmatrix[i][j]=matrix[l][i];
                l--;
            }
        }
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix.length; j++){
                matrix[i][j]=newmatrix[i][j];
            }
        }
    }
    public static void main(String[] args) {
        
        //Matrix initialization.
        int[][] mat = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        
        rotate(mat);

        for(int i = 0;i<mat.length;i++){
            for(int j=0;j<mat.length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}
