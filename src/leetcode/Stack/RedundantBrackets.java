package leetcode.Stack;

import java.util.Stack;

public class RedundantBrackets {
    public static void main(String[] args) {

    }

    public static boolean findRedundantBrackets(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                st.push(ch);
            }else{
                if(ch==')'){
                    boolean isRedundant=true;
                    while(st.peek()!='('){
                        char top=st.peek();
                        if(top=='+'||top=='*'||top=='/'||top=='-'){
                            isRedundant=false;
                        }

                        st.pop();
                    }
                    if(isRedundant){
                        return true;
                    }
                    st.pop();
                }
            }
        }
        return false;
    }

}
