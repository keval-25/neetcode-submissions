class Solution {
    public int findDuplicate(int[] nums) {
        
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(mp.getOrDefault(nums[i],0) > 0){
                return nums[i];
            }
            mp.put(nums[i], mp.getOrDefault(nums[i], 1));
        }

        return 0;
    }
}
