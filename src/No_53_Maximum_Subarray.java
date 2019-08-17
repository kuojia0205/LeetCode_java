
public class No_53_Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        if(nums == null && nums.length == 0)
            return 0;
        else if(nums.length == 1)
            return nums[0];

        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        int maxSum = nums[0];
        for(int i=1; i<dp.length; i++)
        {
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }
}
