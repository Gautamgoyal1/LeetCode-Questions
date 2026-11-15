class Solution {
    public int maxProduct(int[] nums) {
        int n  = nums.length;
        int pre = 1;
        int suff = 1;
        int maxi = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            if(suff == 0) suff = 1;
            if(pre == 0) pre = 1;
            pre *= nums[i];
            suff *= nums[n-i-1];
            maxi = Math.max(maxi,Math.max(suff,pre));
        }
        return maxi;
    }
}