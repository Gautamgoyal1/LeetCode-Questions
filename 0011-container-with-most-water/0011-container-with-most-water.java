class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        if(n==0) return 0;
        int i = 0;
        int j = n-1;
        int maxArea = 0;
        while(i<=j){
            int w = j - i;
            int h = Math.min(height[j],height[i]);
            int area = w * h;
            maxArea = Math.max(maxArea,area);
            if(height[j]>height[i]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }
}