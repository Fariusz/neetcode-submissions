class Solution {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) return false;

        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(')
                    return false;
            }

            if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[')
                    return false;
            }

            if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{')
                    return false;
            }
        }

        return stack.isEmpty();
    }
}