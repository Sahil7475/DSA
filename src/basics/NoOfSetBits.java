package basics;

import java.util.Scanner;

public class NoOfSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            int bit = n&1;
            if(bit==1){
                count++;
            }
            n=n>>1;
        }
    }
}
