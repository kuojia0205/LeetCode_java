public class No_3_Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String s_origin) {
        char[] s = s_origin.toCharArray();

        if(s.length <= 1)
            return s.length;

        int ans = 1;

        int pointer_1 = 0;
        int pointer_2 = 1;

        while(pointer_2 < s.length)
        {
            for(int i=pointer_1+1; i<pointer_2; i++)
            {
                if(s[i] == s[pointer_1] || s[i] == s[pointer_2] || s[pointer_1] == s[pointer_2])
                {
                    ans = Math.max(ans, pointer_2 - pointer_1);
                    pointer_1++;
                    break;
                }
            }
            pointer_2++;
        }

        return ans;
    }

}
