class Solution {

    public String encode(List<String> strs) {

        if(strs.size() == 0) return "";
        StringBuilder ans = new StringBuilder();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            ans.append(strs.get(i).length()).append("~");
            str.append(strs.get(i));
        }
        ans.append(str);
        return ans.toString();
    }

    public List<String> decode(String str) {

        if(str.length() == 0){
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>();
        String x[] = str.substring(0,str.lastIndexOf('~')).split("~");
        String mainStr = str.substring(str.lastIndexOf('~')+1,str.length());
        int start = 0;
        int end = 0;
        int count = 0;
        while(count < x.length){
            if((end-start) < Integer.parseInt(x[count])){
                end++;
            }
            else if((end - start) == Integer.parseInt(x[count])){
                ans.add(mainStr.substring(start, end));
                end++;
                start = end-1;
                count++;
            }
        }
        return ans;
    }
}
