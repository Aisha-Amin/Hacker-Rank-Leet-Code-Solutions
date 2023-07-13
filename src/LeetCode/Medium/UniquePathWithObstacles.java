package LeetCode.Medium;

public class UniquePathWithObstacles {
    /*You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.

Return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The testcases are generated so that the answer will be less than or equal to 2 * 109.
Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
Output: 2
Explanation: There is one obstacle in the middle of the 3x3 grid above.
There are two ways to reach the bottom-right corner:
1. Right -> Right -> Down -> Down
2. Down -> Down -> Right -> Right
     */
    public static void main(String[] args) {

        //int[][] obstacleGrid = new int[][] {{0,0,0},{0,1,0},{0,0,0}};
        int[][] obstacleGrid = new int[][] {{0,1},{0,0}};
        // m  -> number of rows
        // n -> number of columns
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        System.out.print(findUniquePathWithObstacle(m,n,obstacleGrid));

    }

    private static int findUniquePathWithObstacle(int m, int n, int[][] obstacleGrid) {

        if(obstacleGrid == null || obstacleGrid.length == 0)
            return 0;

        if(obstacleGrid[m-1][n-1] == 1 || obstacleGrid[0][0] == 1)
            return 0;

        int[][] matrix = new int[m][n];

        for(int i=0;i<m;i++){
            //on the first column, if there is an obstacle, the rest are blocked.
            if(obstacleGrid[i][0] == 1){
                matrix[i][0] = 0;
                break; //no need to continue.
            }else{
                matrix[i][0] = 1;
            }
        }

        for(int j=0;j<n;j++){
            //on the first row, if there is an obstacle, the rest are blocked.
            if(obstacleGrid[0][j] == 1){
                matrix[0][j] = 0;
                break; //no need to continue.
            }else{
                matrix[0][j] = 1;
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j] == 1 ){
                    matrix[i][j] = 0;
                }else{
                    matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
                }
            }
        }

        return matrix[m-1][n-1];

    }
}
