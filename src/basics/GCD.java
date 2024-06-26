package basics;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();

        System.out.print("GCD of " + a + " and " + b
                + " is " + GCD(a, b));

    }

    public static int GCD(int a, int b){
        int result = Math.min(a,b);
        while (result>0){
            if(a%result==0 && b%result==0){
                break;
            }
            result--;
        }
    return result;
    }

    //using recursion

    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }

        if(a==b){
            return b; // or a
        }

        if(a>b){
        return    gcd(a-b,b);
        }
        return gcd(a,b-a);
    }

}
