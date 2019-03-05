package ValidParentheses_20_3_3;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch=='(') {
                stack.push(')');
            }
            else if (ch=='[') {
                stack.push(']');
            }
            else if (ch=='{') {
                stack.push('}');
            }
            else {
                if (stack.isEmpty()||ch!=stack.pop())
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
