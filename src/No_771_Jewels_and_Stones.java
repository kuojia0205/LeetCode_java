public class No_771_Jewels_and_Stones {
    public static int numJewelsInStones(String J, String S)
    {
        char[] JJ = J.toCharArray();
        char[] SS = S.toCharArray();
        int count = 0;

        for(int i=0; i<SS.length; i++)
        {
            char curr_S = SS[i];
            for(int j=0; j<JJ.length; j++)
            {
                char curr_J = JJ[j];
                if(curr_S == curr_J)
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
