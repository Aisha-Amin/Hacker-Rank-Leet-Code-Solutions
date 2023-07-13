package LeetCode.Medium;

public class UniquePath {
    /*There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.
Input: m = 3, n = 7
Output: 28
     */
    public static void main(String[] args) {

        // m  -> number of rows
        // n -> number of columns
        int m = 3, n = 2;
        int[][] matrix = new int[m][n];

        System.out.print(findUniquePath(m,n,matrix));

    }

    private static int findUniquePath(int m, int n, int[][] matrix) {

        if(m == 0  || n == 0)
            return 0;

        if(m == 1 || n == 1)
            return 1;

        // fill up the column 0 values with 1 means up->down position possible path is only 1
        for(int i=0;i<m;i++)
            matrix[i][0] = 1;

        // fill up the row 0 values with 1 means left->right position possible path is only 1
        for(int j=0;j<n;j++)
            matrix[0][j] = 1 ;

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                // summing the number of paths from the cell above and the cell to the left
                matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
            }
        }

        return matrix[m-1][n-1];
        // this the last finish point with maximum value to reach the end
    }

}
