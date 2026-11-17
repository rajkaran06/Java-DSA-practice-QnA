class Solution {
    int [][]dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        dp = new int [m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return paths(obstacleGrid,0,0);
    }
    public int paths(int[][]grid,int i,int j){
        int m = grid.length;
        int n = grid[0].length;
        //out of bounds
        if(i>=m || j>=n) return 0;
        if(grid[i][j]==1) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]= paths(grid,i+1,j) +paths(grid,i,j+1);
    }
}
