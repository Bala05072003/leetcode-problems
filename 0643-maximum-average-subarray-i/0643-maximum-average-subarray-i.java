class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double max=0;
       
        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        double win=max;
        for(int i=k;i<n;i++){
            win+=nums[i]-nums[i-k];
            max=Math.max(win,max);
        }
        return max/k;
    }
}