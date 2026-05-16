class Solution { 
    public List<List<Integer>> threeSum(int[] numbers){

    Arrays.sort(numbers);
    Set<List<Integer>> result = new HashSet<>();
    for(int i=0;i<numbers.length;i++) {
    int left = i+1, right = numbers.length-1;
    while(left < right) {
    List<Integer> temp = new ArrayList<>();
    if(numbers[i] + numbers[left] + numbers[right] == 0) {
    temp.add(numbers[i]);
    temp.add(numbers[left]);
    temp.add(numbers[right]);
    result.add(temp);
    right--;
    }
    else if(numbers[i] + numbers[left] + numbers[right] > 0) {
    right--;
    }
    else{
    left++;
    }
    }
    }
    return new ArrayList(result);
    }
}
