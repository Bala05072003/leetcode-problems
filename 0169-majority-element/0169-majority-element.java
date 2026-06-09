class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> ht=new HashMap<>();
        for(int n:nums){
            ht.put(n,ht.getOrDefault(n,0)+1);
            if(ht.get(n)>nums.length/2){
                return n;
            }
        }
        return -1;
        }
}