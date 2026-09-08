class Solution {
    public int helper(int i , int j , int[][] nums , int[][] dp){
        if(i<0 || j<0) return 0;
        if(i==0 && j==0) return 1;
        if(nums[i][j] == 1) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int up = helper(i-1,j,nums,dp);
        int left = helper(i,j-1,nums,dp);
        return dp[i][j] = up + left;
    }
    public int uniquePathsWithObstacles(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        int[][] dp = new int[m][n];
        for(int[] rows : dp){
            Arrays.fill(rows,-1);
        }
        if(nums[0][0] == 1) return 0;
        if(nums[m-1][n-1] == 1) return 0;
        return helper(m-1,n-1,nums,dp);
    }
}