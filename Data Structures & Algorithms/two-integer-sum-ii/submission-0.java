class Solution { 
    public static int[] twoSum(int[] numbers, int target) {
    int ans[] = {-1,-1};
    int left=0, right=numbers.length-1;
    while(left < right) {
    if(numbers[left]+numbers[right] == target) {
    ans[0] = left+1;
    ans[1] = right+1;
    break;
    }
    else if(numbers[left]+numbers[right] > target) {
    right--;
    }
    else {
    left++;
    }
    }
    return ans;
    }
    }