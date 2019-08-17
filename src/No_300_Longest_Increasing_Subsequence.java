public class No_300_Longest_Increasing_Subsequence {
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int count;
        int ans = 1;
        for(int i=1; i<nums.length; i++)
        {
            count = 0;
            for(int j=0; j<i; j++)
            {
                if(nums[j] < nums[i])
                {
                    count = Math.max(count, dp[j]);
                }
            }
            dp[i] = count + 1;
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}
