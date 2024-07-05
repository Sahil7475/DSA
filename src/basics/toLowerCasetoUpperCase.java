package basics;

public class toLowerCasetoUpperCase {
    public static void main(String[] args) {
        System.out.println(toLowerCase('A'));
        System.out.println(toUpperCase('s'));
    }

    public static char toLowerCase(char ch){
        if(ch>='a' && ch<='z'){
            return ch;
        }else{
            char temp= (char) (ch- 'A'+ 'a');
            return temp;
        }
    }
    public static char toUpperCase(char ch){
        if(ch>='A' && ch<='Z'){
            return ch;
        }else{
            char temp= (char) (ch- 'a'+ 'A');
            return temp;
        }
    }
}
