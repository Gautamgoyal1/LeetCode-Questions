class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            sum += nums[i];
            mp.put(sum,i);
        }
        if(sum < x) return -1;
        int remaining = sum - x;
        sum = 0;
        int longest = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            sum+=nums[i];
            int find = sum - remaining;
            if(mp.containsKey(find)){
                int idx = mp.get(find);
                longest = Math.max(longest,i-idx);
            }
        }
        return longest == Integer.MIN_VALUE ? -1 : n - longest;
    }
}