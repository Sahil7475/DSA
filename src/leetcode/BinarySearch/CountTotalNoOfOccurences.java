package leetcode.BinarySearch;

public class CountTotalNoOfOccurences {
    public static void main(String[] args) {
        int[] arr = {0,1,1,2};
        int ans=0;
        int value= lastOccurence(arr,1) - firstOccurence(arr,1);
        if(value!=0){
            ans=value+1;
        }
        System.out.println(ans);
    }
    public static int firstOccurence (int[] arr,int key){
        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                ans=arr[mid];
                end=mid-1;
            }else if(arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }

        return ans;
    }

    public static int lastOccurence (int[] arr,int key){
        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                ans=arr[mid];
                start=mid+1;
            }else if(arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }

        return ans;
    }
}
