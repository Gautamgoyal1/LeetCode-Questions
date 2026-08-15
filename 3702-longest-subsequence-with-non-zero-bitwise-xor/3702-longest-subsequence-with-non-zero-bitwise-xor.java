class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int non_Zero = 0;
        int total = 0;
        for(int i=0 ; i<n ; i++){
            if(nums[i] != 0)non_Zero++;
            total ^= nums[i];
        }
        if(total>0) return n;
        if(non_Zero>0) return n-1;
        return 0;
    }
}