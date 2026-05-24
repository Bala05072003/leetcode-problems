class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int maxlen=0;
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(hs.contains(ch)){
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(ch);
            maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}