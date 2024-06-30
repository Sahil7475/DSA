package searchingandsorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {1, 77, 12, 24, 5};
        int s = 0;
        int e = a.length - 1;
        mergeSort(a, s, e);
        printArray(a);
    }

    public static void mergeSort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;

        // left part sorting
        mergeSort(arr, s, mid);

        // right part sorting
        mergeSort(arr, mid + 1, e);

        // merging both arrays
        merge(arr, s, mid, e);
    }

    public static void merge(int[] arr, int s, int mid, int e) {
        int len1 = mid - s + 1;
        int len2 = e - mid;

        int[] first = new int[len1];
        int[] second = new int[len2];

        int mainArrayIndex = s;
        for (int i = 0; i < len1; i++) {
            first[i] = arr[mainArrayIndex++];
        }

        mainArrayIndex = mid + 1;
        for (int i = 0; i < len2; i++) {
            second[i] = arr[mainArrayIndex++];
        }

        // merge 2 sorted arrays
        int index1 = 0;
        int index2 = 0;
        mainArrayIndex = s;

        while (index1 < len1 && index2 < len2) {
            if (first[index1] < second[index2]) {
                arr[mainArrayIndex++] = first[index1++];
            } else {
                arr[mainArrayIndex++] = second[index2++];
            }
        }
        while (index1 < len1) {
            arr[mainArrayIndex++] = first[index1++];
        }
        while (index2 < len2) {
            arr[mainArrayIndex++] = second[index2++];
        }
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
