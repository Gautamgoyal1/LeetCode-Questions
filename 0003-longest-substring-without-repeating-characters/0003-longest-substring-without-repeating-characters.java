class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0) return 0;
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        int l = 0;
        int r = 0;
        int longest = 1;
        while(r<n){
            if(hash[s.charAt(r)] != -1){
                l = Math.max(hash[s.charAt(r)]+1,l);
            }
            longest = Math.max(longest,r-l+1);
            hash[s.charAt(r)] = r;
            r++;
        }
        return longest;
    }
}