import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class No_229_Majority_Element_II {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new LinkedList<>();

        if(nums.length == 0)
            return ans;

        Arrays.sort(nums);
        int temp = nums[0];
        int count = 1;
        for(int i=1; i<nums.length; i++)
        {
            if(temp == nums[i])
                count++;
            else
            {
                if(count > nums.length/3)
                    ans.add(temp);
                temp = nums[i];
                count = 1;
            }
        }
        if(count > nums.length/3)
            ans.add(temp);
        return ans;
    }
}
