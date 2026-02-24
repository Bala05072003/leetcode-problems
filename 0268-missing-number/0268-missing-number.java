class Solution {
    public int missingNumber(int[] nums) {
        int expectedsum=0;
        int actualsum=0;
        int n=nums.length;
        expectedsum=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            actualsum+=nums[i];
        }
        return expectedsum-actualsum;

    }
}