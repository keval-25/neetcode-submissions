class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.get(nums[i]) != null){
                return true;
            }
            mp.put(nums[i],1);
        }
        return false;
    }
}