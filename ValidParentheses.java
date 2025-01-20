import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        // Stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through the characters in the string
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // Handle closing brackets
            else {
                // If the stack is empty or the top of the stack doesn't match the closing bracket, return false
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets are properly closed
        return stack.isEmpty();
    }

    // Helper method to check if the pair of brackets matches
    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();

        // Test cases
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";

        // Printing results
        System.out.println(solution.isValid(test1)); // true
        System.out.println(solution.isValid(test2)); // true
        System.out.println(solution.isValid(test3)); // false
        System.out.println(solution.isValid(test4)); // false
        System.out.println(solution.isValid(test5)); // true
    }
}
