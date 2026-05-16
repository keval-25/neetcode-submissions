class Solution {
    public int search(int[] nums, int target) {
        
        int low=0, high = nums.length-1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target) return mid;
            /*This if is added to handle cases when array can have duplicate element 
            and both low and high have same values*/
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && nums[mid] >= target)  high = mid-1;
                else    low = mid+1;
            }
            else{
                if(nums[mid] <= target && nums[high] >= target) low = mid+1;
                else    high = mid-1;
            }
        }

        return -1;
    }
}
