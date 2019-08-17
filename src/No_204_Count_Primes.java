public class No_204_Count_Primes {
    public static int countPrimes(int n) {
        if(n <= 2)
            return 0;

        int[] dp = new int[n];
        dp[0] = 2;
        int dp_pointer = 1;
        for(int i=3; i<n; i++)
        {
            for(int j=0; j<dp_pointer; j++)
            {
                if(i%dp[j] == 0)
                    break;
                else if(j == dp_pointer-1)
                {
                    dp[dp_pointer] = i;
                    dp_pointer++;
                    break;
                }
            }
        }
        return dp_pointer;
    }
}
