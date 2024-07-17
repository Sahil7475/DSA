package leetcode.Stack;

import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {

    }
    public static void sortedInsert(Stack<Integer> s, int elem){
        //base case
        if(s.isEmpty() || (!s.isEmpty() && s.peek()<elem)){
            s.push(elem);
            return;
        }
        int n=s.peek();
        s.pop();

        sortedInsert(s, elem);
        s.push(n);
    }

    public static void sortStack(Stack<Integer> s) {
        // Write your code here.

        //base case
        if(s.isEmpty()){
            return;
        }

        int num=s.peek();
        s.pop();

        sortStack(s);

        sortedInsert(s, num);

    }
}
