public class Main {
    public static void main(String[] args)
    {
        char[][] input = {
                        {'1', '1', '1', '1', '0'},
                        {'1', '1', '0', '1', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'}
        };
        int k = 2;
        int ans = No_200_Number_of_Islands.numIslands(input);
    }
}
