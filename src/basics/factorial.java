package basics;

public class factorial {
    public static void main(String[] args) {
        int n=5;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact * i;
        }
        System.out.println(fact);
        System.out.println(factorial(n));
    }


    //using recursion
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }



}
