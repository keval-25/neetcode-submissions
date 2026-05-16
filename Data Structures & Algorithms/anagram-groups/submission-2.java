class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();
        int occurence[] = new int[strs.length];
        for(int i=0;i<strs.length;i++){
            List<String> str = new ArrayList<>();
            str.add(strs[i]);
            if(occurence[i] == 1){
                continue;
            }
            for(int j=i+1;j<strs.length;j++){
                if(i != j && isAnagram(strs[i], strs[j])){
                    occurence[j] = 1;
                    str.add(strs[j]);
                }
            }
            ans.add(str);
        }
        return ans;
    }

    public boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        Map<String, Integer> mp1 = new HashMap<>();
        Map<String, Integer> mp2 = new HashMap<>();
        for(int i=0;i<str1.length();i++){
            if(mp1.get(str1.charAt(i) + "") == null){
                mp1.put(str1.charAt(i) + "",1);
            }
            else{
                mp1.put(str1.charAt(i) + "", mp1.get(str1.charAt(i) + "")+1);
            }
        }
        for(int i=0;i<str2.length();i++){
            if(mp2.get(str2.charAt(i) + "") == null){
                mp2.put(str2.charAt(i) + "",1);
            }
            else{
                mp2.put(str2.charAt(i) + "", mp2.get(str2.charAt(i) + "")+1);
            }
        }
        if(!mp1.equals(mp2)){
            return false;
        }
        return true;
    }
}
