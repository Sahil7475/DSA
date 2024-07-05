package array;

public class ConstantWindow {

    public static void main(String[] args) {
        int k=4;
        int sum=7;
        int l=0;
        int r=k-1;
        int[] arr={-1,2,3,4,5,-1};
        int n = arr.length;
        for(int i=l;i<r;i++){
            while (r<n-1){
                sum=sum-arr[l];
                l++;
                r++;
                sum=sum+arr[r];

            }
        }
    }
}
