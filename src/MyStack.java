import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        String original = "s * (s – a) * (s – b) * (s – c)";

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == '(') {
                stack.push(i);
            } else if (original.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }

        if (stack.empty()) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
