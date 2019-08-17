import java.util.Arrays;

public class No_64_Minimum_Path_Sum {
    public static int minPathSum(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0 || grid == null)
            return 0;
        int[][] dp = new int [grid.length][grid[0].length];
        int sum = 0;
        for(int i=0; i<grid.length; i++)
            sum = sum + sum_of_array(grid[i]);
        for(int i=0; i<grid.length; i++)
            Arrays.fill(dp[i], sum);
        dp[0][0] = grid[0][0];
        for(int i=1; i<grid.length; i++)
            dp[i][0] = dp[i-1][0] + grid[i][0];
        for(int i=1; i<grid[0].length; i++)
            dp[0][i] = dp[0][i-1] + grid[0][i];
        for(int i=1; i<grid.length; i++)
        {
            for(int j=1; j<grid[0].length; j++)
            {
                dp[i][j] = Math.min(dp[i][j], dp[i-1][j]+grid[i][j]);
                dp[i][j] = Math.min(dp[i][j], dp[i][j-1]+grid[i][j]);
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }

    public static int sum_of_array(int[] arr)
    {
        if(arr.length == 0 || arr == null)
            return 0;

        int sum = 0;
        for(int i=0; i<arr.length; i++)
            sum = sum+arr[i];
        return sum;
    }
}
