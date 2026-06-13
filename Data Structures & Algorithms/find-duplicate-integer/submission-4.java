class Solution {
    
    //It is not the optimal solution which is required as it used O(n) space 
    /*
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
    */


    public int findDuplicate(int[] nums) {

        for(int i=0;i<nums.length;i++){

            if(nums[Math.abs(nums[i]) - 1] < 0){
                return Math.abs(nums[i]);
            }
            nums[Math.abs(nums[i]) - 1] *= -1;
        }
        return 0;
    }
}
