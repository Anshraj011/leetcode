class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
          if (s.length() % 2 != 0)
            return false;
        for(char c : s.toCharArray()){
            if(c=='{' || c=='[' || c=='(') st.push(c);
            else{ 
            if(!st.isEmpty()){
                if(st.peek()== '(' &&  c==')' || st.peek()=='[' && c==']' || st.peek()=='{' && c=='}') {
                    st.pop();
                 
                }
                else return false;
            }
            else return false ;
        }
        }
        return st.isEmpty();
    }
}