package leetcode.arrays;
/*
* nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
* */

public class rotateArray {
    public static void main(String[] args) {

    }
    public void rotate(int[] arr, int k) {
        int n = arr.length;

        // Reverse the whole array
        Reverse(arr, 0, n - 1);
        // Reverse the first k elements
        Reverse(arr, 0, k - 1);
        // Reverse the remaining elements from k to n-1
        Reverse(arr, k, n - 1);
    }
    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
