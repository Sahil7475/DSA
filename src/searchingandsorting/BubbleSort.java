package searchingandsorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {1,52,4,89,78};
        bubbleSort(a,a.length);
        printArray(a);


    }
    public static void bubbleSort(int[] arr, int n) {
        // Write your code here.
        for(int i=1;i<n;i++){
            boolean swapped = false;
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    swapped=true;
                    swap(arr,j,j+1);
                }
            }
            if(swapped==false){
                break;
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void printArray(int[] a){
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
