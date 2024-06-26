package array;

public class SumOfArrayElem {
    public static void main(String[] args) {

        int[] a={10,20,7,54};

        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }

        System.out.println(sum);

        System.out.println("Sum of only even no is "+SumOfEvenArr(a));

    }

    public static int SumOfEvenArr(int a[]){
        int s=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                s=s+a[i];
            }
        }
        return s;
    }

}
