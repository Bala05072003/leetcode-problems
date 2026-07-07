class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int l=0;int maxl=0;
        for(int i:hs){
            if(!hs.contains(i-1)){
             int num=i;
                l=1;
            while(hs.contains(num+1)){
                num++;
                l++;
            }
            maxl=Math.max(l,maxl);
            }
        }
        return maxl;
    }
}