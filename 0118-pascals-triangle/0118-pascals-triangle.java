class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<Integer> arr;
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            arr=new ArrayList<>();
            arr.add(1);
            for(int j=1;j<i;j++){
                int value=ls.get(i-1).get(j-1)+ls.get(i-1).get(j);
                arr.add(value);
            }
            if(i>0){
                arr.add(1);
            }
            ls.add(arr);
        }
        return ls;
    }
}