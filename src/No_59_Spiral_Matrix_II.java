public class No_59_Spiral_Matrix_II {
    public static void spiralMatrix(int n)
    {
        if(n<=0)
            return;
        int[][] output = new int[n][n];
        int num = 1;
        int row_start = 0;
        int row_end = n-1;
        int col_start = 0;
        int col_end = n-1;
        while(row_start<= row_end && col_start<=col_end)
        {
            for(int i=col_start; i<=col_end; i++)
            {
                output[row_start][i] = num;
                num++;
            }
            row_start++;

            for(int i=row_start; i<=row_end; i++)
            {
                output[i][col_end] = num;
                num++;
            }
            col_end--;

            for(int i=col_end; i>=col_start; i--)
            {
                output[row_end][i] = num;
                num++;
            }
            row_end--;

            for(int i=row_end; i>=row_start; i--)
            {
                output[i][col_start] = num;
                num++;
            }
            col_start++;
        }
        System.out.println(output);
        return;
    }
    public static void spiralMatrix_reverse(int n)
    {
        int[][] output = new int[n][n];
        if(n<=0)
            return;
        int num = 1;
        int row_1 = n/2;
        int row_2 = n/2;
        int col_1 = n/2;
        int col_2 = n/2;
        while(num<=n*n)
        {
            if(row_1 == row_2 && col_1 == col_2)
            {
                output[row_1][col_1] = num;
                col_1--;
                num++;
                continue;
            }
            for(int i=row_2; i>=row_1; i--)
            {
                output[i][col_1] = num;
                num++;
            }
            row_1--;
            if(num >= n*n)
                break;

            for(int i=col_1; i<=col_2; i++)
            {
                output[row_1][i] = num;
                num++;
            }
            col_2++;
            if(num >= n*n)
                break;

            for(int i=row_1; i<=row_2; i++)
            {
                output[i][col_2] = num;
                num++;
            }
            row_2++;
            if(num >= n*n)
                break;

            for(int i=col_2; i>=col_1; i--)
            {
                output[row_2][i] = num;
                num++;
            }
            col_1--;
            if(num >= n*n)
                break;
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.printf("%d ", output[i][j]);
            }
            System.out.printf("\n");
        }
        return;
    }
}
