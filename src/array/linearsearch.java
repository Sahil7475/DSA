package array;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int[] a={1,5,7,8,9};
        Scanner sc = new Scanner(System.in);

        int k=sc.nextInt();

        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                System.out.println("the key is present at "+i);
                break;
            }
        }

    }
}
