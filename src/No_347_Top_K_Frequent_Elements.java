import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class No_347_Top_K_Frequent_Elements {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> ans = new LinkedList<>();
        Arrays.sort(nums);
        int count = 1;
        int[] dp_num = new int[k];
        int[] dp_count = new int[k];
        int temp = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] == temp)
            {
                count++;
            }
            else
            {
                for(int j=0; j<k; j++)
                {
                    if(dp_count[j] < count)
                    {

                    }
                }
                count = 1;
                temp = nums[i];

            }
        }
        return ans;
    }
}
