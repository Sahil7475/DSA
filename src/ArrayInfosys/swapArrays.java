package ArrayInfosys;

public class swapArrays {
    public static void main(String[] args) {
        int a[] = {21,22,23,24};
        int b[] = {25,26,27,28};
        int n = a.length;

        swaparrays(a,b,n);

        System.out.println("Array a");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

        System.out.println("Array b");
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }
    }
    public static void swaparrays(int[] a,int[] b,int n){
        for(int i=0;i<n;i++){
            int temp=a[i];
            a[i]=b[i];
            b[i]=temp;
        }
    }
}
