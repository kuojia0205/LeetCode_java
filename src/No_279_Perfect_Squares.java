import java.util.Arrays;

public class No_279_Perfect_Squares {
    public static int numSquares(int n) {
        if(n <= 0)
            return 0;
        int[] dp = new int[n+1];
        Arrays.fill(dp, n);
        dp[0] = 0;
        dp[1] = 1;
        for(int i=0; i<dp.length; i++)
        {
            for(int j=1; i+j*j<=n; j++)
            {
                dp[i+j*j] = Math.min(dp[i+j*j], dp[i]+1);
            }
        }
        return dp[n];

    }
    //This is a recursion method, but it's not helpful to this problem.
//    public static int numSquares(int n, int count) {
//        if(Math.sqrt(n) == Math.floor(Math.sqrt(n)))
//        {
//            count++;
//            return count;
//        }
//        n = n - (int)Math.pow((int)Math.sqrt(n),2);
//        count++;
//        return numSquares(n,count);
//    }
}
