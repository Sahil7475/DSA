package array;

import java.util.Scanner;

public class GetMaxGetMin {

    public static void main(String[] args) {
        int[] arr= new int[100];

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }



        System.out.println("the max value is "+getMax(arr,n));
        System.out.println("the min value is "+getMin(arr,n));
    }

    public static int getMax(int[] arr,int n){

        int maxi=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }

        return maxi;
    }
    public static int getMin(int[] arr,int n){

        int mini=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
        }

        return mini;
    }


}
