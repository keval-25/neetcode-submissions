class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.get(nums[i]) == null){
                mp.put(nums[i],1);
            }
            else{
                mp.put(nums[i], mp.get(nums[i]) + 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort(Map.Entry.comparingByValue());
        return list.subList(list.size() - k,list.size())
                 .stream()
                 .map(Map.Entry::getKey)    
                 .mapToInt(Integer::intValue)
                 .toArray();
    }
}
