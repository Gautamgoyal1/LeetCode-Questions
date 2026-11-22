class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int cntA = 0;
        int cntB = 0;
        for(int i=0 ; i<n ; i++){
            if(s.charAt(i) == 'a'){
                if(cntB == 0) cntA++;
                else return false;
            }
            if(s.charAt(i) == 'b'){
                cntB++;
            }
        }
        return true;
    }
}