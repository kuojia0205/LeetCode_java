public class No_3_Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String s) {
        char[] ss = s.toCharArray();
        char[] s_1 = new char[ss.length];
        if(ss.length <= 1)
            return ss.length;
        int len = 0;
        int i = 0;
        while(i < ss.length - 1 && ss.length - i + 1 > len)
        {

        }
        return len;
    }

}
