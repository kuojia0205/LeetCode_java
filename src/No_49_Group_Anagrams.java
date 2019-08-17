import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_49_Group_Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        char[][] input_char = new char[strs.length][];
        int[][] input = new int[strs.length][];
        for(int i=0; i<input.length; i++)
        {
            input_char[i] = strs[i].toCharArray();
            input[i] = new int[input_char[i].length];
            for(int j=0; j<input[i].length; j++)
                input[i][j] = (int)input_char[i][j];
            Arrays.sort(input[i]);
        }
        for(int i=0; i<input.length; i++)
        {
            if(input[i] == null)
                continue;
            List<String> curr = new ArrayList<>();
            curr.add(strs[i]);
            for(int j=i+1; j<input.length; j++)
            {
                if(input[j] == null)
                    continue;
                else
                {
                    int k=0;
                    for(k=0; k<Math.min(input[i].length, input[j].length); k++)
                    {
                        if(input[i][k] != input[j][k])
                            break;
//                        else
//                            continue;
                    }
                    if((k == Math.min(input[i].length, input[j].length) && !strs[i].equals("") )|| strs[i].equals("") && strs[j].equals(""))
                    {
                        curr.add(strs[j]);
                        input[j] = null;
                    }
                }
            }
            output.add(curr);
            curr = null;
        }
        return output;
    }
}
