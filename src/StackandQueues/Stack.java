package StackandQueues;

public class Stack {
    int[] arr;
    int top;
    int size;

    Stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1; // empty array
    }

    public  void push(int element){
        if(size - top >1){
            top++;
            arr[top]=element;
        }else {
            System.out.println("Stack Overflow");
        }
    }

    public  void pop(){
        if(top>=0){
            top--;
        }else{
            System.out.println("Stack Underflow");
        }
    }

    public  int peek(){
        if(top>=0 && top<size){
            return arr[top];
        }else {
            System.out.println("Stack is empty");
        }
        return 0;
    }

    public  boolean isEmpty(){
        if(top==-1){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(25);
        st.push(50);
        st.push(75);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }

}
