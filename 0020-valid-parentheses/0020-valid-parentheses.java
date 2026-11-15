class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n % 2 != 0) return false;
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<n ; i++){
            if((s.charAt(i) == '(') || (s.charAt(i) == '{') || (s.charAt(i) == '[')) st.push(s.charAt((i)));
            else{
                if(st.size() == 0) return false;
                char c = st.peek();
                st.pop();
                if((s.charAt(i) == ')' && c != '(') || (s.charAt(i) == ']' && c != '[') || (s.charAt(i) == '}' && c != '{')) return false; 
            }
        }
        return st.size() == 0;
    }
}