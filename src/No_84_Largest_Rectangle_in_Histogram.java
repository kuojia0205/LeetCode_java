//Problem solved.

public class No_84_Largest_Rectangle_in_Histogram {
    public static int largestRectangleArea(int[] heights) {
        if(heights == null || heights.length < 1)
            return 0;
        int largest_rec = 0;
        for(int i=0; i<heights.length; i++)
        {
            if(i+1 < heights.length)
            {
                if(heights[i] <= heights[i+1])
                    continue;
            }

            int min_height = heights[i];
            for(int j=i; j>=0; --j)
            {
                if(heights[j]<min_height)
                    min_height = heights[j];
                largest_rec = Math.max(largest_rec, min_height*(i-j+1));
            }
        }

        return largest_rec;
    }
}
