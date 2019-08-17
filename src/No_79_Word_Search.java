//Problem solved, but a review is required.
public class No_79_Word_Search {
    public static boolean exist(char[][] board, String word) {
        if(board == null)
            return false;
        int[][] flag = new int[board.length][board[0].length];
        for(int i=0; i<board.length; i++)
            for(int j=0; j<board[0].length; j++)
            {
                if(if_OK(board,word,i,j,0, flag))
                    return true;
            }
        return false;
    }

    public static boolean if_OK(char[][] board, String word, int row, int col, int index, int[][] flag)
    {
        if(index == word.length())
            return true;

        if(row<0 || row>=board.length || col<0 || col>=board[0].length || word.toCharArray()[index]!=board[row][col] || flag[row][col] == 1)
            return false;

        flag[row][col] = 1;
        if(if_OK(board,word,row+1,col,index+1,flag)
                ||if_OK(board,word,row-1,col,index+1,flag)
                ||if_OK(board,word,row,col+1,index+1,flag)
                ||if_OK(board,word,row,col-1,index+1,flag))
            return true;
        flag[row][col] = 0;
        index--;
        return false;
    }
}
