public class Solution{
    public int longestConsecutive(int[] nums){

    int maxValue = 0, count = 1;
    List<Integer> st = new ArrayList<>();
    for(int i=0;i<nums.length;i++) {
    if(!st.contains(nums[i]))
    st.add(nums[i]);
    }
    Collections.sort(st);
    for(int i=st.size()-1;i>=0;i--) {
    if(st.contains(st.get(i)-1)) {
    count++;
    }
    else {
    maxValue = Math.max(maxValue, count);
    count=1;
    }
    }
    return maxValue;


    }
    }
