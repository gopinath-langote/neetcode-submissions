class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> reverseMap = Map.of('(', ')', '{', '}', '[', ']');
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.empty()) {
                stack.push(c);
            } else {
                Character lastChar = stack.peek();
                if (!reverseMap.containsKey(lastChar)) {
                    return false;
                }
                if (reverseMap.get(lastChar) == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }
}
