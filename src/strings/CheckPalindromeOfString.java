package strings;

public class CheckPalindromeOfString {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] charArray = s.toCharArray();
        int start=0;
        int end = charArray.length-1;
        while(start<end){
            if(toLowerCase(charArray[start])!=toLowerCase(charArray[end])){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
    public static char toLowerCase(char ch){
        if(ch>='a' && ch<='z'){
            return ch;
        }else{
            char temp= (char) (ch- 'A'+ 'a');
            return temp;
        }
    }
}
