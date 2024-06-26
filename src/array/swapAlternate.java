package array;

public class swapAlternate {
    public static void main(String[] args) {
        int[] even = {1,2,3,4,5,6};
        int[] odd = {11, 33, 9, 76, 43};
/*
        SwapAlternateBoundaryPairs(even,even.length);
        printArr(even);*/
/*        SwapAlternateBoundaryPairs(odd,odd.length);
        printArr(odd);*/
        SwapAlternate(even,even.length);
        printArr(even);

        SwapAlternate(odd,odd.length);
        printArr(odd);
    }
    public static void SwapAlternate(int[] a,int n){
        for(int i=0;i<n;i+=2){
            if(i+1<n){
                swapAlter(a,i,i+1);
            }
        }
    }

/*    Input: arr[] = {1, 2, 3, 4, 5, 6}
    Output: 6 2 4 3 5 1*/

    public static void SwapAlternateBoundaryPairs(int[] a,int n){
        int start=0;
        int end=n-1;
        while(start<end){
            swapAlter(a,start,end);
            start=start+2;
            end=end-2;
        }
    }


    public static void swapAlter(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void printArr(int a[]){
        System.out.println("th array is ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +", ");
        }
    }

}
