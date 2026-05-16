class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> mp = new HashMap<>();
        for(String s : strs){

            int[] chars = new int[26];
            for(char ch : s.toCharArray()){
                chars[ch - 'a']++;
            }

            mp.putIfAbsent(Arrays.toString(chars),new ArrayList<>());
            mp.get(Arrays.toString(chars)).add(s);
        }

        return  new ArrayList<>(mp.values());
    }
}
