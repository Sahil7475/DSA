package leetcode.Stack;

import java.util.Stack;

public class InsertElementAtBottomInStack {
    public static void main(String[] args) {

    }
    public static void solve(Stack<Integer> s, int x) {
        // Base case
        if (s.isEmpty()) {
            s.push(x);
            return;
        }

        int num = s.peek();
        s.pop();

        // Recursive call
        solve(s, x);

        s.push(num);
    }

    public static Stack<Integer> pushAtBottom(Stack<Integer> myStack, int x) {
        solve(myStack, x);
        return myStack;
    }
}
