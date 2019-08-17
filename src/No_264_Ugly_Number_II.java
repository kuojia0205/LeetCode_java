import java.util.Arrays;

public class No_264_Ugly_Number_II {
    public static int nthUglyNumber(int n) {
        if(n<=5)
            return n;
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for(int i=0; i<=5; i++)
            dp[i] = i;
        int kkk;
        for(int i=6; i<=n; i++)
        {
            for(int j=2; j<=i; j++)
            {
                if(dp[j]*2 > dp[i-1])
                    dp[i] = (int)Math.min((long)dp[i], dp[j]*2L);
                else if(dp[j]*3 > dp[i-1])
                    dp[i] = (int)Math.min((long)dp[i], dp[j]*3L);
                else if(dp[j]*5 > dp[i-1])
                    dp[i] = (int)Math.min((long)dp[i], dp[j]*5L);
            }
        }
        return dp[n];
    }
}
