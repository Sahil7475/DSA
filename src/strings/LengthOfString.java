package strings;

public class LengthOfString {
    public static void main(String[] args) {
        String s="sahil";

        int length=0;
        for(int i=0;;i++){
          try{
              if (s.charAt(i)!=' '){
                  length++;
              }
          }catch (Exception e){
              break;
          }
        }
        System.out.println(length);


    }
}
