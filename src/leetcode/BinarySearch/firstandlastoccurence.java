package leetcode.BinarySearch;

public class firstandlastoccurence {
    public static void main(String[] args) {
        int[] arr={0,1,1,5};
        int[] ans=new int[2];
        ans[0]=firstOccurence(arr,1);
        ans[1]=lastOccurence(arr,1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
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
