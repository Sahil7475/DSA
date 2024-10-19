package array;

public class CountOcuurencesOfnoInArray {

    public static int count(int arr[], int n, int x) {

        int count=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==x){
                count++;
            }
        }

        int start = 0;
        int end  = n-1;

        while(start<=end){
            int mid = start + end - start /2;

            if(x>arr[mid]){
                start = mid +1 ;
            }else if(arr[mid]==x){
                return mid;
            }else{
                end = mid - 1;
            }

        }

        return count;
    }

    public static int findFirst(int[] arr, int x) {
        int start = 0, end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                result = mid; // update result and keep searching to the left
                end = mid - 1;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    // Function to find the last occurrence of x using binary search
    public static int findLast(int[] arr, int x) {
        int start = 0, end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                result = mid; // update result and keep searching to the right
                start = mid + 1;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    // Function to count the occurrences of x in the array
    public static int countOccurrences(int[] arr, int x) {
        int first = findFirst(arr, x);
        if (first == -1) {
            return 0; // element not found
        }

        int last = findLast(arr, x);
        return last - first + 1;
    }


}
