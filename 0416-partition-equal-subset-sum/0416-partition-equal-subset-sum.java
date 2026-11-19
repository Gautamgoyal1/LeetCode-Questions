class Solution {
    public Boolean helper(int[] nums , int i , int x , Boolean[][] vis){
        if(x==0) return true;
        if(i >= nums.length) return false;
        if(vis[i][x] != null) return vis[i][x];
        Boolean take = false;
        if(x >= nums[i]){
            take = helper(nums,i+1,x-nums[i],vis);
        }
        Boolean notTake = helper(nums,i+1,x,vis);
        return vis[i][x] = take || notTake;
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            sum+=nums[i];
        }
        if(sum % 2 != 0) return false;
        int x = sum / 2;
        Boolean[][] vis = new Boolean[n][sum];
        return helper(nums , 0 , x ,vis);
    }
}