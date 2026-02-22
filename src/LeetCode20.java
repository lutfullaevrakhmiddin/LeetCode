import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class LeetCode20 {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                return false;
            } else if (s.charAt(i) == '(') {
                stack.push(')');
            } else if (s.charAt(i) == '[') {
                stack.push(']');
            } else if (s.charAt(i) == '{') {
                stack.push('}');
            } else if (s.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}