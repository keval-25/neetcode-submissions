class Solution {
    public int[] twoSum(int[] nums, int target) {

    int[] ans = new int[2];
    // Brute Force Solution    
    /*  for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    if(i > j){
                        ans[0] = j;
                        ans[1] = i;
                    }
                    else{
                        ans[0] = i;
                        ans[1] = j;
                    }
                    break;
                }
            }
        }
        return ans; */

    // Better Solution
    Map<Integer, Integer> mp = new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(mp.get(target - nums[i]) != null){
            if(mp.get(target - nums[i]) != i){
                if(i > mp.get(target - nums[i])){
                    ans[0] = mp.get(target - nums[i]);
                    ans[1] = i;
                }
                else{
                    ans[0] = i;
                    ans[1] = mp.get(target - nums[i]);
                }
            }
        }
        mp.put(nums[i],i);
    }
    return ans;
    }
}
