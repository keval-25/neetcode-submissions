class MinStack {

    ArrayList<Integer> stk;
    public MinStack() {
        this.stk = new ArrayList<>();
    }
    
    public void push(int val) {
        this.stk.add(val);
    }
    
    public void pop() {
        this.stk.remove(stk.size()-1);
    }
    
    public int top() {
        return this.stk.get(stk.size()-1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;

        for(int i=0;i<this.stk.size();i++){
            if(stk.get(i) < min){
                min = stk.get(i);
            }
        }
        return min;
    }
}
