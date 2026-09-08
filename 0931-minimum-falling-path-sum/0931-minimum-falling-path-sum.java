class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] prev = new int[n];
        for(int i=0 ; i<n ; i++){
            prev[i] = matrix[0][i];
        }
        for(int i=1 ; i<m ; i++){
            int[] curr = new int[n];
            for(int j=0 ; j<n ; j++){
                int up = prev[j];
                int ld = (int) 1e8;
                if(j-1>=0) ld = prev[j-1];
                int rd = (int) 1e8;
                if(j+1 < n) rd = prev[j+1];
                curr[j] = matrix[i][j] + Math.min(up,Math.min(ld,rd));
            }
            prev = curr;
        }
        int mini = (int) 1e8;
        for(int i=0 ; i<n ; i++){
            mini = Math.min(mini,prev[i]);
        }
        return mini;
    }
}