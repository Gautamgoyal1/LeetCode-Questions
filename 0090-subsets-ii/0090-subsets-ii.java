class Solution {
    public void helper(int[] nums , int ind , int n , List<List<Integer>> result , List<Integer> temp){
        result.add(new ArrayList<>(temp));
        for(int i=ind ; i<n ; i++){
            if(i!=ind && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            helper(nums,i+1,n,result,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,n,result,temp);
        return result;
    }
}