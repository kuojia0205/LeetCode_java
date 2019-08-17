//Problem solved, but a review is required.
public class No_00_Eight_Queens {
    private int size;
    private int count;

    public No_00_Eight_Queens(int size)
    {
        this.size = size;
        this.count = 0;
    }

    public void EightQueens()
    {
        int[][] chessboard = new int[this.size][this.size];
        putQueenAtRow(chessboard, 0);

    }

    private void putQueenAtRow(int[][] chessboard, int row)
    {
        if(row == this.size)
        {
            this.count++;
            System.out.println("第 "+ this.count +" 种解：");
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                {
                    System.out.printf("%d\t",chessboard[i][j]);
                }
                System.out.println();
            }
            return;
        }

        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
                chessboard[row][j] = 0;
            chessboard[row][i] = 1;
            if(can_place(chessboard, row, i))
            {
                putQueenAtRow(chessboard, row+1);
            }
        }

    }

    public boolean can_place(int[][] chessboard, int row, int col)
    {
        int step=1;
        while(row-step>=0){
            if(chessboard[row-step][col]==1)                //中上
                return false;
            if(col-step>=0 && chessboard[row-step][col-step]==1)        //左上
                return false;
            if(col+step<size && chessboard[row-step][col+step]==1)        //右上
                return false;

            step++;
        }
        return true;
    }
}
