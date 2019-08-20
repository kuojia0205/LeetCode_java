public class No_200_Number_of_Islands {
    public static int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                if(grid[i][j] == '1')
                {
                    count++;
                    is_land(grid, i, j);
                }
            }
        }
        return count;
    }


    public static void is_land(char[][] grid, int i, int j)
    {
        if(i < 0 || j < 0 || i>=grid.length || j>=grid[0].length)
            return;
        if(grid[i][j] == '1')
        {
            grid[i][j] = '0';
            is_land(grid, i+1, j);
            is_land(grid, i, j+1);
            is_land(grid, i, j-1);
            is_land(grid, i-1, j);
        }
        else
            return;
    }

}
