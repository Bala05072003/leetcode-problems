class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=s.length()-1;i>=0;i--){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),i);
            }
        }
        int start=0;
        int last=0;
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            last = Math.max(last, hm.get(s.charAt(i)));
            if(i==last){
               li.add(i-start+1);
               start=i+1;
            }
        }
        System.out.print(hm);
        return li;
    }
}