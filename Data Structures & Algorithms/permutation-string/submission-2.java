class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        HashMap<Character, Integer> mp1 = new HashMap<>();
        HashMap<Character, Integer> mp2 = new HashMap<>();

        if(s1.length() > s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            mp1.put(s1.charAt(i), mp1.getOrDefault(s1.charAt(i),0) + 1);
            mp2.put(s2.charAt(i), mp2.getOrDefault(s2.charAt(i),0) + 1);
        }
        if(mp1.equals(mp2)){
            return true;
        }
        int left = 0, right = s1.length() - 1;

        while(right < s2.length()){
            if(mp2.get(s2.charAt(left)) == 1){
                mp2.remove(s2.charAt(left));
            }
            else{
                mp2.put(s2.charAt(left), mp2.get(s2.charAt(left)) - 1);
            }
            left++;
            right++;
            if(right >= s2.length()) break;
            mp2.put(s2.charAt(right), mp2.getOrDefault(s2.charAt(right),0) + 1);
            System.out.println("Map 2 in loop : "+mp2);
            if(mp1.equals(mp2)) return true;
        }
        return false;
    }
}
