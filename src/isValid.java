import java.util.Stack;

/**
 * @Author James Murphy (Jmurph08)
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 * Input: s = "()"
 * Output: true
 *
 * Example 3:
 * Input: s = "(]"
 * Output: false
 **/
public class isValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();


        for (char c : s.toCharArray()) { // Iterate through each character in the string
            if (c == '(' || c == '{' || c == '[') {// If the character is an opening bracket, push it onto the stack
                stack.push(c);
            } else { // If the character is a closing bracket
                // If the stack is empty or the top of the stack doesn't match the closing bracket
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty, it means all brackets were properly matched
        return stack.isEmpty();

    }
}
