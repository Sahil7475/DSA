package basics;

import java.util.Scanner;

public class BinaryTodecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;int ans =0;
        while(n!=0){
            int digit=n%10;
            if(digit==1){
                ans =ans+(int)Math.pow(2,i);
            }
            n/=10;
            i++;
        }
        System.out.println(ans);
    }
}
