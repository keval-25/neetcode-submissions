class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        for(int i=0;i<t.length();i++){
            if(!s.contains(""+t.charAt(i))) return false;
        }
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(mp.get(s.charAt(i)) == null){
                mp.put(s.charAt(i),1);
            }
            else{
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }
            if(mp.get(t.charAt(i)) == null){
                mp.put(t.charAt(i),1);
            }
            else{
                mp.put(t.charAt(i),mp.get(t.charAt(i))+1);
            }
        }

        for(Map.Entry<Character, Integer> ent : mp.entrySet()){
            if(ent.getValue() % 2 != 0) return false;
        }
        return true;
    }
}
