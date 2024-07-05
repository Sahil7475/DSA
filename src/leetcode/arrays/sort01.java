package leetcode.arrays;

public class sort01 {
    public static void main(String[] args) {
        int[] arr= {0,1,0,1,0};

        int left =0;
        int right = arr.length-1;

        while(left<right){
         while(left<right && arr[left]==0){
                left++;
            }
            while(left<right && arr[right]==1){
                right--;
            }

            if(arr[left] == 1 && arr[right] ==0){
                swap(arr,left,right);
                left++;
                right--;
            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }

}
