class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[51];
        for(int i=0 ; i<=n-k ; i++){
            for(int j=i ; j<i+k ; j++){
                arr[nums[j]]++;
            }
        }
        int maxi = -1;
        for(int i=0 ; i<n ; i++){
            if(arr[nums[i]] == 1 || k==nums.length) maxi = Math.max(maxi,nums[i]);
        }
        return maxi;
    }
}