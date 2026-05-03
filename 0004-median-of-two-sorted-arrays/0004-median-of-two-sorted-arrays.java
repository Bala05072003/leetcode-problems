class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        
        int[] res=new int[n];
        for(int i=0;i<nums1.length;i++){
            res[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            res[nums1.length+i]=nums2[i];
        }
        Arrays.sort(res);
        double median=0;
        if(res.length%2==0){
            median=(res[n/2])+res[(n/2)-1];
            median=median/2;

        }
        else{
            median=res[(n-1)/2];
        }
    return median;
    }
}