class Solution {
    public void helper(int[] nums , int n , List<List<Integer>> result , List<Integer> temp , boolean[] vis){
        if(temp.size() == n){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0 ; i<n ; i++){
            if(!vis[i]){
                vis[i] = true;
                temp.add(nums[i]);
                helper(nums,n,result,temp,vis);
                temp.remove(temp.size() - 1);
                vis[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] vis = new boolean[n];
        helper(nums,n,result,temp,vis);
        return result;
    }
}