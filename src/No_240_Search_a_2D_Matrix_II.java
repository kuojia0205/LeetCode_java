public class No_240_Search_a_2D_Matrix_II {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0 || matrix == null)
            return false;
        int col = matrix[0].length - 1;
        int row = 0;
        while(row<matrix.length && col >=0)
        {
            if(target == matrix[row][col])
                return true;
            else if(target > matrix[row][col])
                row++;
            else if(target < matrix[row][col])
                col--;
        }
        return false;

    }
}
