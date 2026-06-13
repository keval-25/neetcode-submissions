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

    //This solution is done wit O(1) space complexity but I have updated the existing array so still it can be improved
    /*
    public int findDuplicate(int[] nums) {

        for(int i=0;i<nums.length;i++){

            if(nums[Math.abs(nums[i]) - 1] < 0){
                return Math.abs(nums[i]);
            }
            nums[Math.abs(nums[i]) - 1] *= -1;
        }
        return 0;
    }
    */

    //We will be considering this array a linked list by mapping index -> value at index, 
    //as values are duplicate different indexes will point to same value resulting in a cycle
    //then this cycle can be identified using Floyd's Cycle Detection Algorithm (also called the Tortoise and Hare algorithm)
    //here we will first find the index where both slow and fast meet, then will reset slow to 0th index and then move both one step at a time
    //then where both becomes same that will be our repeating value
    public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(slow != fast);

        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
