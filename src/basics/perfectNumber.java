package basics;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }

        if(sum==n){
            System.out.println("perfect ");
        }

        for(int i=2;i<10000;i++){
            if(perfectNumbersofrange(i)){
                System.out.println(i + " is a perfect number");
            }
        }

    }



    public static boolean perfectNumbersofrange(int num){
        int sum=1;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                if(i*i!=num){
                    sum=sum+i+num/i;
                }
                else {
                    sum+=i;
                }
            }
        }
        if (sum == num && num != 1){ return true; }

        return false;
    }

}
