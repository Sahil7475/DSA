package searchingandsorting;

public class SelectionSort {

    
    public int[] sortArray(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            swapArr(arr,minindex,i);
        }
        return arr;
    }
    public static void swapArr(int a[],int s,int e){
        int temp=a[s];
        a[s]=a[e];
        a[e]=temp;
    }
}
