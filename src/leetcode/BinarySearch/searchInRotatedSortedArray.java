package leetcode.BinarySearch;
/*
* Input: nums = [4,5,6,7,0,1,2], target = 0
* Output: 4
* */

public class searchInRotatedSortedArray {
    public static void main(String[] args) {

    }
    public int search(int[] arr, int k) {
        int n=arr.length;
        int pivot=pivot(arr);
        if(k>=arr[pivot] && k<=arr[n-1]){
            //BS on second line
            return binarySearch(arr,pivot,n-1,k);
        }else{
            //BS on first line
            return binarySearch(arr,0,pivot-1,k);
        }

    }

    public int binarySearch(int[] arr,int s,int e,int target){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }

    public static int pivot (int[] arr){
        int n =arr.length;
        int s = 0;
        int e = n-1;
        int mid = s + (e-s)/2;

        while(s<e) {

            if(arr[mid] >= arr[0])
            {
                s = mid+1;
            }
            else{
                e = mid;
            }
            mid = s + (e-s)/2;
        }
        return s;
    }
}
