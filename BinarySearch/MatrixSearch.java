/*
 * Problem 74 
 * You are given an m x n integer matrix matrix with the following two properties:
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 * You must write a solution in O(log(m * n)) time complexity.
 */
public class MatrixSearch {
    public boolean binarySearch(int[][] matrix, int mid, int target) {
        int l = 0, h = matrix[0].length - 1;
        while (l <= h) {
            int mid1 = (l + h) / 2;
            if (matrix[mid][mid1] == target)
                return true;
            if (matrix[mid][mid1] > target)
                h = mid1 - 1;
            else {
                l = mid1 + 1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int lr = 0, hr = matrix.length - 1, n = matrix[0].length - 1;
        while (lr <= hr) {
            int mid = (lr + hr) / 2;
            if (matrix[mid][0] > target)
                hr = mid - 1;
            else {
                if (matrix[mid][n] >= target)
                    return binarySearch(matrix, mid, target);
                else
                    lr = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 },
                { 61, 70, 80, 90 }
        };
        
        MatrixSearch searcher = new MatrixSearch();

        int target = 3;
        System.out.println(searcher.searchMatrix(matrix, target)); // Output: true

        target = 13;
        System.out.println(searcher.searchMatrix(matrix, target)); // Output: false
    }
}
