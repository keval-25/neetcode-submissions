class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        Map<Character, Integer> countOfStringInSubstring = new HashMap<>();
        int right =1, left = 0;
        int maxValue = Integer.MIN_VALUE;
        countOfStringInSubstring.put(s.charAt(0),1);
        while(left <= right && right < s.length()){
            if(countOfStringInSubstring.get(s.charAt(right)) == null){
                countOfStringInSubstring.put(s.charAt(right),1);
                right++;
            }
            else{
                countOfStringInSubstring.remove(s.charAt(left));
                left++;
            }
            maxValue = Math.max(maxValue, countOfStringInSubstring.size());
        }

        return maxValue;
    }
}
