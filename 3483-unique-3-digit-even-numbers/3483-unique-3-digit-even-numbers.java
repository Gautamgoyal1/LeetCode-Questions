class Solution {
    public int totalNumbers(int[] digits) {
        int cnt = 0;
        int[] mp = new int[10];
        for(int it:digits){
            mp[it]++;
        }
        for(int i=1;i<=9 ; i++){
            if(mp[i] == 0) continue;
            mp[i]--;
            for(int j=0 ; j<=9 ; j++){
                if(mp[j] == 0) continue;
                mp[j]--;
                for(int k=0 ; k<=8 ; k+=2){
                    if(mp[k] == 0) continue;
                    cnt++;
                }
                mp[j]++;
            }
            mp[i]++;
        }
        return cnt;
    }
}