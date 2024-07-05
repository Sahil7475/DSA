package strings;

// ip:- sahil jadhav
// op:- lihas vahdaj

public class ReverseWordsInStringAttheirOGPosition {
    public static void main(String[] args) {
    String s ="sahil jadhav";

    char[] charArray=s.toCharArray();

    int start =0;

    for(int i =0;i<=charArray.length;i++){
        // if space comes or the string reach to end reverse
        if(i==charArray.length||charArray[i]==' '){
            reverse(charArray,start,i-1);
            start=i+1;
        }
    }

    for(char c :charArray){
        System.out.print(c);
    }


    }
    public static void reverse(char[] arr,int start,int end){
       while(start<end){
           char temp = arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
    }

}
