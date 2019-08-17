public class No_75_Sort_Colors {
    public void sortColors(int[] nums)
    {
        sort(nums, 0, nums.length-1);
    }

    public static void sort(int[] nums, int lo, int hi)
    {
        if(hi <= lo)
            return;
        int j = partition(nums,lo,hi);

        sort(nums, lo, j-1);
        sort(nums, j+1, hi);
    }

    public static int partition(int[] nums, int lo, int hi)
    {
        int i = lo;
        int j = hi+1;
        int v = nums[lo];

        while(true)
        {
            while(nums[++i]<v)
            {
                if(i == hi)
                    break;
            }

            while(nums[--j]>v)
            {
                if(j == lo)
                    break;
            }
            if(i >= j)
                break;
            exch(nums,i,j);
        }
        exch(nums,lo,j);
        return j;
    }

    public static void exch(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
