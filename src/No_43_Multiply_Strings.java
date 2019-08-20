
public class No_43_Multiply_Strings {
    public String multiply(String num1, String num2) {
        char[] n_1 = num1.toCharArray();
        char[] n_2 = num2.toCharArray();

        int NUM_1 = compute_num(n_1);
        int NUM_2 = compute_num(n_2);

        String ans = NUM_1 * NUM_2 + "";
        return ans;
    }

    public int compute_num(char[] num)
    {
        int ans = 0;
        int curr;
        for(int i=num.length-1; i>=0; i--)
        {
            curr = num[i] - '0';
            ans = ans + curr * (int)Math.pow(10, num.length - i + 1);
        }
        return ans;
    }
}
