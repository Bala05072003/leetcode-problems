class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int[] ans=new int[nums.length];
        int pos=ans.length-1;
        while(l<=r){
            int leftsq=nums[l]*nums[l];
            int rightsq=nums[r]*nums[r];
            if(leftsq>rightsq){
                ans[pos]=leftsq;
                l++;
            }
            else{
                ans[pos]=rightsq;
                r--;
            }
            pos--;
        }
        return ans;
   }
}