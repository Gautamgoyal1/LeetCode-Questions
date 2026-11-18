class Solution {
    public boolean solve(String s , int idx , List<String> wordDict , int n,Boolean[] vis){
        if(idx == n){
            return true;
        }
        if(vis[idx] != null) return vis[idx];
        for(int i=idx+1 ; i<=n ; i++){
            String str = s.substring(idx,i);
            if(wordDict.contains(str) && solve(s,i,wordDict,n,vis)){
                return vis[idx] = true;
            }
        }
        return vis[idx] = false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        Boolean[] vis = new Boolean[s.length()];
        return solve(s,0,wordDict,n,vis);
    }
}