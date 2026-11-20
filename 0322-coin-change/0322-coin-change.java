class Solution {
    public int helper(int[] nums , int idx , int x , int[][] dp){
        if(x == 0){
            return 0;
        }
        if(x < 0 || idx == nums.length) return 88888;
        if(dp[idx][x] != -1) return dp[idx][x];
        int take = 1 + helper(nums,idx,x-nums[idx],dp);
        int notTake = helper(nums,idx+1,x,dp);
        return dp[idx][x] = Math.min(take,notTake);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        int ans = helper(coins,0,amount,dp);
        if(ans == 88888) return -1;
        return ans;
    }
}