package leetcode.BinarySearch;

public class searchInsertPosition {
    public static void main(String[] args) {
        int[] arr= {1,3,5,6};
        System.out.println(searchInsert(arr,5));
    }
    public static int searchInsert(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target>arr[mid]){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return s;
    }
}
