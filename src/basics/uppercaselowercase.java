package basics;

import java.util.Scanner;

public class uppercaselowercase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char c=sc.next().charAt(1);
        if(c>=97 && c<=122){
            System.out.println("Lowercase");
        }else if(c>=65 && c<=90){
            System.out.println("Uppercase");
        }else {
            System.out.println("It is a number");
        }

    }
}
