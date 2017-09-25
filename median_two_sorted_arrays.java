class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int len = l1+l2;
        int[] arr = new int[len];
        for(int i=0;i<l1;i++){
            arr[i] = nums1[i];
        }
        for(int i=0;i<l2;i++){
            arr[l1+i] = nums2[i];
        }
        Arrays.sort(arr);
        if(len%2 != 0)
            return arr[len/2];
        else{
            return (arr[len/2]+arr[len/2 - 1])/2.0;
        }
    }
}
