class TimeMap {

    Map<String, List<Pair<Integer, String>>> list;
    public TimeMap() {
        list = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(list.get(key) == null){
            list.put(key, new ArrayList<>());
        }
        list.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {

        if(!list.containsKey(key)) return "";

        List<Pair<Integer, String>> lst = list.get(key);
        int low=0, high = lst.size() - 1;
        String ans = "";

        while(low <= high){
            int mid = low + (high - low)/2;
            int tstmp = lst.get(mid).getKey();
            if(tstmp == timestamp) return lst.get(mid).getValue();
            else if(tstmp < timestamp){
                ans = lst.get(mid).getValue();
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
