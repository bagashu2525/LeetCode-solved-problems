import java.util.ArrayList;
import java.util.List;
class SpiralMatrix{
    public static List<Integer> spiralOrder(int[][] matrix) {
        int left=0, top=0;
        int bottom= matrix.length-1;
        int right=matrix[0].length-1;

        List<Integer> arr = new ArrayList<>();
        while(top<=bottom && left<=right){
            //left to right
            for(int i = left; i<=right; i++){
                arr.add(matrix[top][i]);
            }
            top++;

            //top to bottom
            for(int i = top; i<=bottom; i++){
                arr.add(matrix[i][right]);
            }
            right--;

            //right to left
            if(top<=bottom){
                for(int i = right; i>=left; i--){
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //bottom to up
            if(left<=right){
                for(int i = bottom; i>=top; i--){
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        
        //Matrix initialization.
        int[][] mat = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       };
        
        List<Integer> ans = spiralOrder(mat);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
}