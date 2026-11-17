class Solution {
    public void helper(int[] nums , int ind , int n , List<List<Integer>> result , List<Integer> temp){
        if(ind == n){
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[ind]);
        helper(nums,ind+1,n,result,temp);
        temp.remove(temp.size()-1);
        helper(nums,ind+1,n,result,temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(nums,0,n,result,temp);
        return result;
    }
}