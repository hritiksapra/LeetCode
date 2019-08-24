//Runtime: 1 ms, faster than 94.19% of Java online submissions for Jewels and Stones.
//Memory Usage: 34.8 MB, less than 100.00% of Java online submissions for Jewels and Stones.

class Solution {
    public int numJewelsInStones(String J, String S) {
        int sum = 0;
        Set<Character> hasher = new HashSet<>();
        
        for (char c: J.toCharArray()) {
            hasher.add(c);
        }
        for (char c: S.toCharArray()) {
            if (hasher.contains(c))
                sum++;
        }
        return sum;
    }
}