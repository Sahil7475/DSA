package leetcode.arrays;

/*
* https://www.naukri.com/code360/problems/sort-0-1-2_631055
* */

public class sort012 {
    public static void main(String[] args) {

    }
    public static void sort012(int[] arr)
    {
        //Write your code here
        int start=0;
        int mid=0;
        int end=arr.length-1;
        while(mid<=end){
            if(arr[mid]==0){
                swap(arr,start,mid);
                start++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }else if(arr[mid]==2){
                swap(arr, mid, end);
                end--;
            }
        }

    }
    public static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
