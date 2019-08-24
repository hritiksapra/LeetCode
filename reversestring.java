//Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse String.
// Memory Usage: 47.6 MB, less than 91.12% of Java online submissions for Reverse String.

class Solution {
    public void reverseString(char[] s) {
        if (s.length > 0) {
            int l = s.length - 1;
            for (int i = 0; i <= l/2; i++) {
                char c = s[i];
                s[i] = s[l - i];
                s[l - i] = c;
            }
        }
    }
}