package StackandQueues;

import java.util.* ;
import java.io.*;
import java.util.Stack;

/*
* implement two stack in one array one stack from left i.e. top1 and one stack from right i.e. top2
* */
public class TwoStack {

    int[] arr;
    int size;
    int top1;
    int top2;

    // Initialize TwoStack.
    public TwoStack(int s) {
        // Write your code here

        this.size=s;
        top1=-1;
        top2=s;
        arr=new int[s];


    }

    // Push in stack 1.
    public void push1(int num) {
        // Write your code here
        if(top2-top1>1){
            top1++;
            arr[top1]=num;
        }
    }

    // Push in stack 2.
    public void push2(int num) {
        // Write your code here
        if(top2-top1>1){
            top2--;
            arr[top2]=num;
        }
    }

    // Pop from stack 1 and return popped element.
    public int pop1() {
        // Write your code here
        if(top1>=0){
            int ans=arr[top1];
            top1--;
            return ans;
        }else{
            return -1;
        }
    }

    // Pop from stack 2 and return popped element.
    public int pop2() {
        // Write your code here
        if(top2<size){
            int ans=arr[top2];
            top2++;
            return ans;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        char[] s={'h','e','l','l','0'};
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length;i++){
            st.push(s[i]);
        }
        for(char ch:st){
            System.out.println(ch);
        }
        for(int i=0;i<st.size();i++){
            s[i]=st.peek();
            st.pop();
        }

    }

}

