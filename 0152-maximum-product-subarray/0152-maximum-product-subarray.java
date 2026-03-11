class Solution {
    public int maxProduct(int[] nums) {
       int n=nums.length;
       int max=nums[0];
       int min=nums[0];
       int res=nums[0];
       for(int i=1;i<n;i++){
        int tempmax=Math.max(nums[i],Math.max(nums[i]*max,nums[i]*min));
        int tempmin=Math.min(nums[i],Math.min(nums[i]*max,nums[i]*min));

        max=tempmax;
        min=tempmin;
        res=Math.max(res,max);
       }
       return res;
    }
}