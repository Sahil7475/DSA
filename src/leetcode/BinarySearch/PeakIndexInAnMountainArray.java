package leetcode.BinarySearch;

public class PeakIndexInAnMountainArray {
    public static void main(String[] args) {
        int[] arr={3,4,5,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int s =0;
        int e=arr.length-1;
        while(s<e){
            int mid = s + (e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }else{
                e=mid;
            }

        }
        return s;

    }

}
