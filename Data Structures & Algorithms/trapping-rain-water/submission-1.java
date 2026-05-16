class Solution {

    //Approach-1: 
        //Time Complexity =>  O(n) + O(n) + O(n)        =>      Each for 3 loops
        //Space Complexity  =>  O(n) + O(n)     =>      Each for two extra arrays 
    // public int trap(int[] height) {

    //     int[] prefixMax = new int[height.length];
    //     int[] suffixMax = new int[height.length];
    //     prefixMax[0] = height[0];
    //     suffixMax[height.length-1] = height[height.length-1];
    //     for(int i=1;i<height.length;i++){
    //         prefixMax[i] = Math.max(prefixMax[i-1], height[i]);
    //     }
    //     for(int i=height.length-2;i>=0;i--){
    //         suffixMax[i] = Math.max(suffixMax[i+1], height[i]);
    //     }
    //     int ans = 0;
    //     for(int i=0;i<height.length;i++){
    //         ans += Math.min(prefixMax[i], suffixMax[i]) - height[i];
    //     }
    //     return ans;
    // }

    //Approach-2:
        //Time Complexity =>  O(n)        =>      Only one loop for itearation
        //Space Complexity  =>  O(1)     =>      No extra space is used
    public int trap(int[] height) {
        int ans = 0;
        int left = 0, right = height.length-1;
        int leftMax = 0, rightMax = 0;

        while(left < right){
            if(height[left] <= height[right]){
                if(height[left] < leftMax)  ans += leftMax - height[left];
                else    leftMax = height[left];
                left++;
            }
            else{
                if(height[right] < rightMax)    ans += rightMax - height[right];
                else    rightMax = height[right];
                right--;
            }
        }
        return ans;
    }
}
