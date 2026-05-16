class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put(s.charAt(0), 1);
        int left = 0, right = 1;
        int maxLength = Integer.MIN_VALUE;
        while(right < s.length()){

            mp.put(s.charAt(right), mp.getOrDefault(s.charAt(right), 0)+ 1);

            if(((right - left + 1) - getMaxValueInMap(mp)) > k){
                if(mp.get(s.charAt(left)) == 1){
                    mp.remove(s.charAt(left));
                }
                else{
                    mp.put(s.charAt(left), mp.get(s.charAt(left)) - 1);
                }
                left++;
            }
                
            right++;
            maxLength = Math.max(maxLength, right - left);
        }
        return maxLength;
    }
    
    public int getMaxValueInMap(HashMap<Character, Integer> mp){
        Map.Entry<Character, Integer> maxEntry = Collections.max(
            mp.entrySet(), 
            Map.Entry.comparingByValue()
        );  
        return maxEntry.getValue();
    } 
}
