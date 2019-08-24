//Runtime: 3 ms, faster than 9.31% of Java online submissions for Valid Parentheses.
// Memory Usage: 33.8 MB, less than 100.00% of Java online submissions for Valid Parentheses.

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapper = new HashMap<>();
        mapper.put(')', '(');
        mapper.put('}', '{');
        mapper.put(']', '[');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            if (!mapper.containsKey(c)) {
                stack.push(c);
                continue;
            }
            char comp = mapper.get(c); 
            if (stack.peek() != comp) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return true;
        } 
        return false;
    }
}