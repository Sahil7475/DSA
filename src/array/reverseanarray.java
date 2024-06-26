package array;

public class reverseanarray {
    public static void main(String[] args) {
        int a[]={1,5,8,78,6};
        int start=0;
        int end=a.length-1;
        /*while (start<end){
            swapArr(a,start++,end--);
        }

        printArr(a);*/

        System.out.println("Another swap");

        while(start<end){
            swapArrWithoutTemp(a,start++,end--);
        }
        printArr(a);


    }

    public static void swapArr(int a[],int s,int e){
        int temp=a[s];
        a[s]=a[e];
        a[e]=temp;
    }

    public static void swapArrWithoutTemp(int a[],int s,int e){
        a[s]=a[s]+a[e];
        a[e]=a[s]-a[e];
        a[s]=a[s]-a[e];
    }

    public static void printArr(int a[]){
        System.out.println("th array is ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +", ");
        }
    }



}
