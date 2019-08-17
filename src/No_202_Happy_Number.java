public class No_202_Happy_Number {
    public static boolean isHappy(int n) {
        if(n == 1 || n == 7)
            return true;
        else if(n<10)
            return false;
        String ns = n + "";
        char[] num = ns.toCharArray();
        int new_n = 0;
        for(int i=0; i<num.length; i++)
            new_n = new_n + (int)Math.pow(num[i]-48, 2);
        return isHappy(new_n);
    }
}
