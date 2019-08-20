public class No_85_Maximal_Rectangle {
//    public static int maximalRectangle(char[][] matrix) {
//        int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
//        int max_rec = 0;
//        for(int i=0; i<rows; i++)
//        {
//            for(int j=0; j<cols; j++)
//            {
//                max_rec = Math.max(max_rec, max_rec(matrix, i, j, 0));
//            }
//        }
//        return max_rec;
//    }
//
//    public static boolean is_OK(char[][] matrix, int i, int j, int max)
//    {
//        if(matrix[i][j] == '0')
//            return false;
//        if(is_OK(matrix, i+1, j, max) ||
//            is_OK(matrix, i,j+1, max))
//        {
//            max++;
//            return true;
//        }
//
//    }
}
