class Solution {
    public void helper(String str , int n , char prev , List<String> result){
        if(str.length() == n){
            result.add(new String(str));
            return;
        }
        helper(str+'1',n,'1',result);
        if(prev!='0'){
            helper(str+'0',n,'0',result);
        }
    }
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        helper("",n,'1',result);
        return result;
    }
}