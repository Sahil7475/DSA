package basics;

// 1 1 2 3 5 8 13 21 34 55

import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;int b=1;
        int nextnumber;
        System.out.print(a + " " +b);
        for (int i=2;i<n;i++){
            nextnumber=a+b;
            System.out.print(" "+nextnumber);
            a=b;
            b=nextnumber;
        }

    }


}
