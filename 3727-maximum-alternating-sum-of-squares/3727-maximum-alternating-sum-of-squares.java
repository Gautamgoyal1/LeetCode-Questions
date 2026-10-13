class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
            if(nums[i] < 0){
                nums[i] = -1 * nums[i];
            }
        }
        Arrays.sort(nums);
        int l = 0;
        int r = n-1;
        if(n==1) return nums[0]*nums[0];
        long sum = 0;
        while(l < r){
            long val = nums[r] * nums[r];
            long remove = nums[l] * nums[l];
            r--;
            l++;
            val -= remove;
            sum+=val;
        }
        if(n%2 != 0){
            long val = nums[l] * nums[l];
            sum+=val;
        }
        return sum;
    }
}