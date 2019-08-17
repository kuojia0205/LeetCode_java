import java.util.Arrays;

public class No_45_Jump_Game_II {
    public static int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, nums.length);
        dp[0] = 0;
        for(int i=1; i<nums.length; i++)
        {
            for(int j=0; j<=i-1; j++)
            {
                if(nums[j] + j >= i)
                    dp[i] = Math.min(dp[i], dp[j]+1);
            }
        }
        return dp[nums.length-1];
    }
}
