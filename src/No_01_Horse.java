//Problem solved, but a review is required.
import java.util.Arrays;

public class No_01_Horse {
    private int chessboard_row;
    private int chessboard_col;
    private int[][] chessboard;
    private int[] start_point;
    private int[] goal_point;
    private int count = 1;
    private int count_step = 0;

    public No_01_Horse(int row, int col, int[] start_point, int[] goal_point)
    {
        if(row <= 0 || col <= 0)
        {
            System.out.println("Invalid input.");
            return;
        }
        if(start_point.length != 2 || goal_point.length != 2)
        {
            System.out.println("Invalid input.");
            return;
        }
        this.chessboard_row = row;
        this.chessboard_col = col;
        this.start_point = start_point;
        this.goal_point = goal_point;
        if(start_point[0] < 0 || start_point[1] < 0 || goal_point[0] < 0 || goal_point[1] < 0)
        {
            System.out.println("Invalid input.");
            return;
        }
        if(start_point[0] > chessboard_row-1 || start_point[1] > chessboard_col-1 || goal_point[0] > chessboard_row-1 || goal_point[1] > chessboard_col-1)
        {
            System.out.println("Invalid input.");
            return;
        }
        this.chessboard = new int[chessboard_row][chessboard_col];
        for(int r=0; r<chessboard_row; r++)
            Arrays.fill(this.chessboard[r], 0);
    }

    public void moveHorse(int[] location)
    {
        if(count == chessboard_row * chessboard_col)
            return;
        count_step ++;
        chessboard[location[0]][location[1]] = count;
        if(location[0] == this.goal_point[0] && location[1] == this.goal_point[1])
        {
            System.out.printf("Finished in %d steps.\n", count);
            for(int i=0; i<chessboard_row; i++)
            {
                for(int j=0; j<chessboard_col; j++)
                {
                    System.out.printf("%d\t",chessboard[i][j]);
                }
                System.out.printf("\n");
            }
//            return;
        }

        int[][] points_can_move = this.get_points(location);
        for(int i=0; i<8; i++)
        {
            if(points_can_move[i][0] > 0 && points_can_move[i][1] > 0)
            {
                if(chessboard[points_can_move[i][0]][points_can_move[i][1]] == 0)
                {
                    count ++;
                    moveHorse(points_can_move[i]);
                }
            }
            else
                continue;
        }
        count --;
        chessboard[location[0]][location[1]] = 0;
    }

    public int[][] get_points(int[] location)
    {
        int[][] points = new int[8][2];
        for(int i=1; i<=8; i++)
        {
            points[i-1][0] = this.canMove(location, i)[0];
            points[i-1][1] = this.canMove(location, i)[1];
        }
        return points;
    }

    public int[] canMove(int[] location, int point)
    {
        int[] points = new int[2];
        points[0] = -2;
        points[1] = -2;
        switch (point)
        {
            case 1:
                if(location[0] + 2 <= chessboard_row-1 && location[1] + 1 <= chessboard_col-1 && location[0] + 2 >= 0 && location[1] + 1 >= 0)
                {
                    points[0] = location[0] + 2;
                    points[1] = location[1] + 1;
                    return points;
                }
                else
                    return points;
            case 2:
                if(location[0] + 1 <= chessboard_row-1 && location[1] + 2 <= chessboard_col-1 && location[0] + 1 >= 0 && location[1] + 2 >= 0)
                {
                    points[0] = location[0] + 1;
                    points[1] = location[1] + 2;
                    return points;
                }
                else
                    return points;
            case 3:
                if(location[0] - 1 <= chessboard_row-1 && location[1] + 2 <= chessboard_col-1 && location[0] - 1 >= 0 && location[1] + 2 >= 0)
                {
                    points[0] = location[0] - 1;
                    points[1] = location[1] + 2;
                    return points;
                }
                else
                    return points;
            case 4:
                if(location[0] - 2 <= chessboard_row-1 && location[1] + 1 <= chessboard_col-1 && location[0] - 2 >= 0 && location[1] + 1 >= 0)
                {
                    points[0] = location[0] - 2;
                    points[1] = location[1] + 1;
                    return points;
                }
                else
                    return points;
            case 5:
                if(location[0] - 2 <= chessboard_row-1 && location[1] - 1 <= chessboard_col-1 && location[0] - 2 >= 0 && location[1] - 1 >= 0)
                {
                    points[0] = location[0] - 2;
                    points[1] = location[1] - 1;
                    return points;
                }
                else
                    return points;
            case 6:
                if(location[0] - 1 <= chessboard_row-1 && location[1] - 2 <= chessboard_col-1 && location[0] - 1 >= 0 && location[1] - 2 >= 0)
                {
                    points[0] = location[0] - 1;
                    points[1] = location[1] - 2;
                    return points;
                }
                else
                    return points;
            case 7:
                if(location[0] + 1 <= chessboard_row-1 && location[1] - 2 <= chessboard_col-1 && location[0] + 1 >= 0 && location[1] - 2 >= 0)
                {
                    points[0] = location[0] + 1;
                    points[1] = location[1] - 2;
                    return points;
                }
                else
                    return points;
            case 8:
                if(location[0] + 2 <= chessboard_row-1 && location[1] - 1 <= chessboard_col-1 && location[0] + 2 >= 0 && location[1] - 1 >= 0)
                {
                    points[0] = location[0] + 2;
                    points[1] = location[1] - 1;
                    return points;
                }
                else
                    return points;
        }
        return points;
    }
}
