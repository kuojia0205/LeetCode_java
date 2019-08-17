public class No_494_Target_Sum {
    public static int findTargetSumWays(int[] nums, int S) {
        int ans = 0;
        int[][] dp = new int[nums.length][];
        dp[0] = new int [2];
        dp[0][0] = nums[0];
        dp[0][1] = -nums[0];
        int count = 1;
        int len = dp.length;
        for(int i=1; i<len; i++)
        {
            int curr_length = (int)Math.pow(2, i+1);
            dp[i] = new int[curr_length];
            for(int j=0; j<curr_length; j++)
            {
                if(j%2 == 0 && j!=1)
                    dp[i][j] = dp[i-1][j/2] + nums[count];
                else
                    dp[i][j] = dp[i-1][j/2] - nums[count];
            }
            count++;
        }

        int[] test = dp[dp.length-1];
        for(int i=0; i<test.length; i++)
        {
            if(test[i] == S)
                ans ++;
        }
        return ans;
    }
}
