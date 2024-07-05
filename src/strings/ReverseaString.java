package strings;

import java.util.Stack;

public class ReverseaString {
    public static void main(String[] args) {

        String s = "sahil jadhav";

        //one method is by converting string into charArray and using swap technique
        char[] c =s.toCharArray();
        //reverseAstring(c);

        //another by using stack
        reverseAstringUsingStack(c);

    }

    public static void reverseAstringUsingStack(char[] c){
        Stack<Character> stack=new Stack<>();

        for(char c1:c){
            stack.push(c1);
        }

        String st="";

        while(!stack.isEmpty()){
            st+=stack.pop();
        }

        System.out.println(st);
    }

    public static void reverseAstring(char[] c){
        int start=0;
        int end=c.length-1;

        while(start<end){
            swap(c,start++,end--);
        }

        for(char c1:c){
            System.out.print(c1);
        }
    }

    public static void swap(char[] arr,int start,int end){
        char temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }


}
