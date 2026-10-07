class Solution {
    public int findTheWinner(int n, int k) {
        int start = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=1 ; i<=n ; i++){
            q.add(i);
        }
        while(q.size() != 1){
            for(int i=1 ; i<k ; i++){
                int x = q.peek();
                q.poll();
                q.add(x);
            }
            q.poll();
        }
        return q.peek();
    }
}