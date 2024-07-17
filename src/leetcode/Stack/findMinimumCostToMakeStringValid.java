package leetcode.Stack;

import java.util.Stack;

public class findMinimumCostToMakeStringValid {
    public static void main(String[] args) {

    }
    public static int findMinimumCost(String str) {
        // Odd condition
        if(str.length()%2==1){
            return -1;
        }
        Stack<Character> st =new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch=='{'){
                st.push(ch);
            }else{
                if(!st.isEmpty()&&st.peek()=='{'){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }
        int a=0;int b=0;
        while(!st.isEmpty()){
            if(st.peek()=='{'){
                b++; // b is my closing bracket

            }else{
                a++;  // a is my opening bracket

            }
            st.pop();
        }
        int ans=(a+1)/2 + (b+1)/2; // this is cost which will require +1 so that it can work for even odd conditions
        return ans;

    }

}
