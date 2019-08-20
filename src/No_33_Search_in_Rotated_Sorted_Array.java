//An example of transformed binary search.
public class No_33_Search_in_Rotated_Sorted_Array {
    public static int search(int[] nums, int target) {
        if(nums.length == 0)
            return -1;
        int left = 0;
        int right = nums.length-1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] >= nums[left])
            {
                if (nums[left] <= target && nums[mid] > target)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else {
                if (nums[mid] < target && nums[right] >= target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }
}
