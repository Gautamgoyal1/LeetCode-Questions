class Solution {
    public boolean uniformArray(int[] nums) {
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        int miniOdd = Integer.MAX_VALUE;
        int miniEven = Integer.MAX_VALUE;
        for(int i= 0 ;i<n ; i++){
            mini = Math.min(mini,nums[i]);
            if(nums[i] % 2 != 0){
                miniOdd = Math.min(miniOdd,nums[i]);
            }
            else{
                miniEven = Math.min(miniEven,nums[i]);
            }
        }
        if(mini % 2 == 0){
            if(miniOdd != Integer.MAX_VALUE){
                return false;
            }
            return true;
        }
        else{
            if(miniEven == Integer.MAX_VALUE) return true;
            if(miniEven > miniOdd) return true;
            return false;
        }
    }
}