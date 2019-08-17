import java.util.ArrayList;
import java.util.List;

public class No_54_Spiral_Matrix {
    public static List<Integer> spiralMatrix(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        int row_1 = 0, row_2 = r-1, col_1 = 0, col_2 = c-1;
        while(row_1 <= row_2 && col_1 <= col_2)
        {
            for(int i=col_1; i<=col_2; i++)
            {
                output.add(matrix[row_1][i]);
            }


            for(int i=row_1+1; i<=row_2; i++)
            {
                output.add(matrix[i][col_2]);
            }

            if(row_1 < row_2 && col_1 < col_2) {
                for (int i = col_2 - 1; i >= col_1; i--) {
                    output.add(matrix[row_2][i]);
                }


                for (int i = row_2; i >= row_1 + 1; i--) {
                    output.add(matrix[i][col_1]);
                }
            }
            col_1++;
            row_1++;
            row_2--;
            col_2--;
        }
        return output;
    }
}
