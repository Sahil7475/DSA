package array;

public class GeneratingSubArrays {
    public static void main(String[] args) {
        int arr[]= { 10,2,55,78,0 };
        System.out.println("The subarrays are");
        System.out.println("By O(n^3) TC");

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println("");
            }
        }

    }
}
