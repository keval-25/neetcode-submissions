class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].matches("-?\\d+")){
                stk.push(Integer.parseInt(tokens[i]));
            }
            else{
                int n1 = stk.pop();
                int n2 = stk.pop();
                if(tokens[i].equals("+")){
                    stk.push(n1 + n2);
                }
                else if(tokens[i].equals("-")){
                    stk.push(n2 - n1);
                }
                else if(tokens[i].equals("/")){
                    stk.push(n2 / n1);
                }
                else if(tokens[i].equals("*")){
                    stk.push(n2 * n1);
                }
                else{
                    stk.push(n2 % n1);
                }
            }
            System.out.println("Stack : "+stk+ " i : "+i);
        }
        return stk.pop();
    }
}
