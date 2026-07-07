class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=0;
        for(int i:piles){
            max=Math.max(max,i);
        }
       int ans=0;
       while(min<=max){
             long totalhrs=0;    
            int mid=(min+max)/2;
            for(int i=0;i<piles.length;i++){
                totalhrs+=(piles[i]/mid)+((piles[i]%mid==0)?0:1);
            }
            if(totalhrs<=h){
                ans=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
       }
       return ans;

    }
}