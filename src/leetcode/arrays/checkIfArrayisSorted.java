package leetcode.arrays;

/*
* i/p :- 10 11 12
* o/p :- true
* */

public class checkIfArrayisSorted {

    public static int isSorted(int n, int []arr) {
        // Write your code here.
        // Array has one or no element
        if (n == 0 || n == 1)
            return 1;

        for (int i = 1; i < n; i++) {
            // Unsorted pair found
            if (arr[i - 1] > arr[i])
                return 0;
        }

        // No unsorted pair found
        return 1;

    }
}
