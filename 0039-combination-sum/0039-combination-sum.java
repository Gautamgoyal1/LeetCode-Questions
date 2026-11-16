class Solution {
    public void helper(int[] nums , int ind , int n , List<List<Integer>> result , List<Integer> temp , int target){
        if(target == 0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(ind == n || target<=0) return; 
        temp.add(nums[ind]);
        helper(nums,ind,n,result,temp,target - nums[ind]);
        temp.remove(temp.size()-1);
        helper(nums,ind+1,n,result,temp,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(candidates,0,n,result,temp,target);
        return result;
    }
}