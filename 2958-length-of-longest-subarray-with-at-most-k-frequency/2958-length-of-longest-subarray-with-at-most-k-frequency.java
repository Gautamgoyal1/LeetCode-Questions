class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int maximumLength = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            while(mp.containsKey(nums[i]) && mp.get(nums[i]) >= k){
                mp.put(nums[left],mp.get(nums[left])-1);
                left++;
            }
            mp.put(nums[i],mp.getOrDefault(nums[i],0) + 1);
            maximumLength = Math.max(maximumLength,i-left+1);
        }
        return maximumLength;
    }
}