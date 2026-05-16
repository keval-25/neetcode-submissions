class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int start = 0;
        int result[] = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            start = i;
            boolean x = false;
            while(start < temperatures.length){
                if(temperatures[start] > temperatures[i]){
                    x = true;
                    break;
                }
                start++;
            }
            if(x == true)
            result[i] = start - i;
            else
            result[i] = 0;
        }
        return result;
    }
}
