public class No_283_Move_Zeros {
    public static void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=0){
                nums[i] = nums[j];
                i++;
            }
        }
        while(i<nums.length)
        {
            nums[i] = 0;
            i++;
        }
    }
}
