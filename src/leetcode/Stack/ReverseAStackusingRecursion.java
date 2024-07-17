package leetcode.Stack;

import java.util.Stack;

public class ReverseAStackusingRecursion {
    public static void main(String[] args) {

    }

    public static void insertElementBottom(Stack<Integer> s, int num){
        if(s.isEmpty()){
            s.push(num);
            return;
        }

        int val=s.peek();
        s.pop();
        insertElementBottom(s,num);

        s.push(val);
    }
    public static void reverseStack(Stack<Integer> s) {
        // write your code here
        //base case
        if(s.isEmpty()){
            return;
        }

        int num=s.peek();
        s.pop();
        reverseStack(s);

        insertElementBottom(s,num);

    }

}
