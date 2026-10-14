class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder str = new StringBuilder();
        int maxi = sum;
        int total = 0;
        while(num>0){
            int val = Math.min(9,sum);
            sum-=val;
            total+=val;
            num--;
            str.append(val);
        }
        if(total!=maxi) return "";
        return str.toString();
    }
}