class Solution {
    public boolean isPalindrome(String x) {

        x = x.toLowerCase();
        String s = "";
        for(int i=0;i<x.length();i++){
            if((x.charAt(i) >= 97 && x.charAt(i) <= 122) || x.charAt(i) >= 48 && x.charAt(i) <= 57) {
                s+= ""+x.charAt(i)+"";
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
}
