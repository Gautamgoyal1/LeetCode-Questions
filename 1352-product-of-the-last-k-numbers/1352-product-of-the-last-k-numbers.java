class ProductOfNumbers {
    ArrayList<Integer> ls;
    public ProductOfNumbers() {
        ls = new ArrayList<>();
    }
    
    public void add(int num) {
        ls.add(num);
    }
    
    public int getProduct(int k) {
        int ans = 1;
        int n = ls.size();
        if(k>n) return -1;
        for(int i=0 ; i<k ; i++){
            ans *= ls.get(n-k+i);
        }
        return ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */