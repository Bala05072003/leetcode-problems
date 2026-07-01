class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int ans=0;
        int onecount=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==1){
                onecount++;
            }
            while((r-l+1)-onecount>k){
                if(nums[l]==1){
                    onecount--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;

    }
}