class Solution {
    public boolean check(String s , int st , int end){
        while(st<=end){
            if(s.charAt(st++) != s.charAt(end--)) return false;
        }
        return true;
    }
    public void helper(String s , int ind , int n , List<List<String>> result , List<String> temp){
        if(ind == n){
            result.add(new ArrayList<>(temp));
            return;
        }
    for(int i=ind ; i<n ; i++){
        if(check(s,ind,i)){
            String str = s.substring(ind,i+1);
            temp.add(str);
            helper(s,i+1,n,result,temp);
            temp.remove(temp.size()-1);
        }
    }
    }
    public List<List<String>> partition(String s) {
        int n = s.length();
        List<List<String>> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        helper(s,0,n,result,temp);
        return result;
    }
}