package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class pairSum {
    public static void main(String[] args) {

    }

    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == s) {
                    int[] pair = {Math.min(arr[i], arr[j]), Math.max(arr[i], arr[j])};
                    ans.add(pair);
                }
            }
        }
        /*     Collections.sort(ans); */
        ans.sort((a, b) -> Integer.compare(a[0], b[0]));
        return ans;

}
}