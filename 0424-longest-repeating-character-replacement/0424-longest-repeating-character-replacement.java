class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] hash =  new int[26];
        int l = 0;
        int r = 0;
        int maxi = 0;
        int maxlen = 0;
        while(r<n){
            hash[s.charAt(r) - 'A']++;
            maxi = Math.max(maxi,hash[s.charAt(r) - 'A']);
            if((r-l+1) - maxi > k){
                hash[s.charAt(l) - 'A']--;
                l++;
            }
            maxlen = Math.max(maxlen,(r-l+1));
            r++;
        }
        return maxlen;
    }
}