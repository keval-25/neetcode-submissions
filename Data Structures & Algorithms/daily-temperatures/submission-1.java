class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int result[] = new int[temperatures.length];
        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<temperatures.length;i++){
            
            while (!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]) {
                int prevIndex = stk.pop();
                result[prevIndex] = i - prevIndex;
            }
            stk.push(i);
        }
        return result;
    }
}
