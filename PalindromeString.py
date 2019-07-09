class Solution:
    def longestPalindrome(self, s: str) -> str:
        stringer = ""
        for x in range(0,len(s) + 1):
            for y in range(0, len(s)):
                if y+x <= len(s):
                    st = s[y:y+x]
                    reversal = st[::-1]
                    if st == reversal:
                        stringer = st
                        break
        return stringer
        