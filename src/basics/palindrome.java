package basics;

// i/p - 121
// o/p - 121

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }

    public static int isPalindrome(int x) {
        int n=x;
        int ans = 0;
        while(n>0){
            int digit = n%10;
            ans = (ans * 10)+digit;
            n=n/10;

        }

        System.out.println(x);
        if(ans == x){
            System.out.println(ans);
        }

        return  ans;
        }





}
