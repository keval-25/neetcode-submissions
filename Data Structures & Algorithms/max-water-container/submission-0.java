class Solution { 
    public static int maxArea(int[] heights) {
    int ans = 0;
    int left = 0, right=heights.length-1;
    while(left < right) {
    int x = heights[left] > heights[right] ? heights[right] : heights[left];
    if((x* (right-left)) > ans) {
    ans = x * (right-left);
    }
    if(heights[left] < heights[right]) {
    left++;
    }
    else{
    right--;
    }
    }
    return ans;
    }
}
