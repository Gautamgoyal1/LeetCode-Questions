class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        Arrays.sort(nums);
        int cnt = 0;
        int longest = 1;
        int smaller = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            if(nums[i]-1 == smaller){
                cnt+=1;
                smaller = nums[i];
            }
            else if(nums[i] != smaller){
                cnt = 1;
                smaller = nums[i]; 
            }
            longest = Math.max(cnt,longest);
        }
        return longest;
    }
}