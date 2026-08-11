class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        boolean visited[] = new boolean[52];
        for(int i=0 ; i<n ; i++){
            visited[nums[i]] = true;
        }
        int prefix = nums[0];
        for(int i=1 ; i<n ; i++){
            if(nums[i] == nums[i-1] + 1){
                prefix+=nums[i];
            }
            else break;
        }
        for(int i=prefix ; i<=51 ; i++){
            if(!visited[i]){
                return i;
            }
        }
        return prefix;
    }
}