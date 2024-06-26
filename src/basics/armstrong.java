package basics;

// i/p 153
// o/p 1cube+5cube+3cube = 153

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=n;
        int ans =0;
        while(x!=0){
            int digit = x%10;
            ans += (int) Math.pow(digit,3);
            x/=10;
        }
        if(n==ans){
            System.out.println("Armstrong number");
        }
    }


}
