class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        if(n==1 && nums[0] == 1) return 2;
        int mini = Integer.MAX_VALUE;
        HashSet<Integer> mp = new HashSet<>();
        for(int i=0 ; i<n ; i++){
            if(nums[i] >= 1 && mini > nums[i]){
                mini = nums[i];
            }
            if(nums[i] > 0){
                mp.add(nums[i]);
            }
        }
        if(mini!=1) return 1;
        int ans = mini;
        while(true){
            if(!mp.contains(mini)){
                ans = mini;
                break;
            }
            mini++;
        }
        return ans;
    }
}