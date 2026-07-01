class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int ans=0;
         int distinct = 0;
        int[] freq=new int[fruits.length];
        for(int r=0;r<fruits.length;r++){
            freq[fruits[r]]++;
            if (freq[fruits[r]] == 1)
                distinct++;

            while (distinct > 2) {
                freq[fruits[l]]--;
                if (freq[fruits[l]] == 0)
                    distinct--;
                l++;
            }
            ans=Math.max(ans,r-l+1);

        }
        return ans;
    }
}