class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        List<Integer> uniqueNumbers = new ArrayList<>(hm.keySet());
        uniqueNumbers.sort((a, b) -> hm.get(b).compareTo(hm.get(a)));
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=uniqueNumbers.get(i);
        }
        return arr;
    }
}