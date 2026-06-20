class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
         return false;
        int [] freq = new int[26];
        for(int i=0;i<s1.length();i++){
          freq[s1.charAt(i)-'a']++;
        }
        int k=s1.length();
        for(int i=0;i<k;i++){
            freq[s2.charAt(i)-'a']--;
        }
        if (allZero(freq))
            return true;
        for (int i = k; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--; 
            freq[s2.charAt(i - k) - 'a']++;
            if (allZero(freq))
                return true;
        }
        return false;
    }

    private boolean allZero(int[] freq) {
        for (int c : freq) {
            if (c != 0)
                return false;
        }
        return true;
    }
}