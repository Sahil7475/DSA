package strings;

// i/p :- sahil jadhav
// o/p :- jadhav sahil

import java.util.regex.Pattern;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "sahil jadhav";
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String str){

        Pattern p = Pattern.compile("\\s");

        //split the string into spaces and add the word in temp string
        String[] temp = p.split(str);
        String result="";


        for(int i =0 ;i<temp.length;i++){
            if(i==temp.length-1){
                result=temp[i]+result; // add the second word
            }else{
                result = " " + temp[i]; // first add the first word
            }
        }
        return result;
    }
}
