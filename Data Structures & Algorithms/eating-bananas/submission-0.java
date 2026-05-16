class Solution { 
    public int minEatingSpeed(int[] piles, int h) {
    int maxOfArray = piles[0];

    for(int i=0;i<piles.length;i++) {
    if(piles[i] > maxOfArray) maxOfArray = piles[i];
    }
    int low=1, high = maxOfArray;
    while(low <= high) {
    int mid = low + (high - low)/2;
    if(countOfHours(piles, mid) <= h) high = mid - 1;
    else low = mid +1;
    }
    return low;
    }

    public int countOfHours(int[] piles, int hr) {

    int ans = 0;
    for(int i=0;i<piles.length;i++) {
    if(piles[i]%hr == 0) {
    ans += piles[i]/hr;
    }
    else {
    ans += piles[i]/hr + 1;
    }
    }
    return ans;
    }
}