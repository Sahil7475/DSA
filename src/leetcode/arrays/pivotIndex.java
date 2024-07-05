package leetcode.arrays;
/*
* Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
* */

public class pivotIndex {
    public static void main(String[] args) {

    }
    public static int pivotIndex(int[] arr){

        int totalsum = 0;
        for(int num:arr){
            totalsum+=num;
        }

        int leftsum=0;
        for(int i=0;i<arr.length;i++){
            if(leftsum==totalsum - leftsum - arr[i]){
                return i;
            }
            leftsum+=arr[i];
        }

        return -1;
    }
}
