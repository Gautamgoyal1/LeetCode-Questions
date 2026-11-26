class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int val = 10;
        int cnt = 0;
        while(n >= val){
            n -= val;
            val--;
            cnt++;
        }
        return cnt % 2 != 0;
    }
}