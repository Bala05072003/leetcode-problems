class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len=nums.length;
        List<Integer> li=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<len;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int i=1;i<=len;i++){
            if(!hm.containsKey(i)){
                li.add(i);
            }
        }
        System.out.print(hm);
        return li;
    }
}