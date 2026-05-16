class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ')' && !stk.isEmpty() && stk.peek() == '('){
                stk.pop();
            }
            else if(s.charAt(i) == '}' &&  !stk.isEmpty() && stk.peek() == '{'){
                stk.pop();
            }
            else if(s.charAt(i) == ']' && !stk.isEmpty() && stk.peek() == '['){
                stk.pop();
            }
            else{
                stk.add(s.charAt(i));
            }
        }
        if(stk.size() == 0) return true;
        return false;
    }
}
