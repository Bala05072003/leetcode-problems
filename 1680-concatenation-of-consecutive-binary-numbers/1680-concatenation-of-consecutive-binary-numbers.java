class Solution {
    public static int concatenatedBinary(int n) {
        long result = 0;
        int mod = 1000000007;
        int length = 0;

        for (int i = 1; i <= n; i++) {

            // If i is power of 2, increase bit length
            if ((i & (i - 1)) == 0) {
                length++;
            }

            // Shift left to make space and add i
            result = ((result << length) + i) % mod;
        }

        return (int) result;
    }
}