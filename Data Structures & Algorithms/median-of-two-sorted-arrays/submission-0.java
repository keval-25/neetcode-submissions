class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;
        int i=0, j=0, k=0;
        int x = n/2, y=n/2 - 1;
        int element1=-1, element2=-1;
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                if(x == k) element1 = nums1[i];
                if(y == k) element2 = nums1[i];
                k++;
                i++;
            }
            else{
                if(x == k) element1 = nums2[j];
                if(y == k) element2 = nums2[j];
                k++;
                j++;
            }
        }
        while(i < n1){
            if(x == k) element1 = nums1[i];
            if(y == k) element2 = nums1[i];
            k++;
            i++;
        }
        while(j < n2){
            if(x == k) element1 = nums2[j];
            if(y == k) element2 = nums2[j];
            k++;
            j++;
        }
        if(n%2 == 0){
            return((double)element1+(double)element2)/2;
        }
        else{
            return (double)element1;
        }
    }
}
