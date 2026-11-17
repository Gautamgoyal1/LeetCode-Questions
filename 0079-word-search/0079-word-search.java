class Solution {
    public boolean helper(char[][] board , String word , int i , int j , int n,int ind){
        if(ind == n){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] != word.charAt(ind)){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = ' ';
        boolean ans = helper(board,word,i+1,j,n,ind+1) || helper(board,word,i-1,j,n,ind+1) || helper(board,word,i,j-1,n,ind+1) || helper(board,word,i,j+1,n,ind+1);
        board[i][j] = temp;
        return ans;
    }
    public boolean exist(char[][] board, String word) {
        int N = board.length;
        int M = board[0].length;
        int n = word.length();
        for(int i=0 ; i<N ; i ++){
            for(int j=0 ; j<M ; j++){
                if(helper(board,word,i,j,n,0)) return true;
            }
        }
        return false;
    }
}