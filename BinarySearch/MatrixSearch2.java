/*
 * Problem : 240
 * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
 * Integers in each row are sorted in ascending from left to right.
 * Integers in each column are sorted in ascending from top to bottom.
 */
class MatrixSearch2 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        int row=0, col= m-1;
        while(row<n && col>-1){
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]>target) col--;
            else row++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 50 },
                { 60, 61, 62, 63 }
        };
        int target = 3;
        System.out.println(searchMatrix(matrix, target)); // Output: true
        target = 31;
        System.out.println(searchMatrix(matrix, target)); // Output: false
    }
}