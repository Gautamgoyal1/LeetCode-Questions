class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int five = 0;
        int ten = 0;
        for(int i=0 ; i<n ; i++){
            if(bills[i] == 5){
                five++;
            }
            else if(bills[i] == 10){
                if(five == 0){
                    return false;
                }
                five--;
                ten++;
            }
            else{
                if(five==0) return false;
                if(ten == 0 && five < 3) return false;
                if(ten == 0 && five > 2){
                    five = five - 3;
                    continue;
                }   
                five--;
                ten--;
            }
        }
        return true;   
    }
}