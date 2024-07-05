package leetcode.BinarySearch;

public class SquareRootN {
    public static void main(String[] args) {

    }
    public static Long binarySearch(Long n) {
        long s = 0;
        long e = n;
        long ans = -1;
        long mid;

        while (s <= e) {
            mid = s + (e - s) / 2;
            long sqr = mid * mid;

            if (sqr == n) {
                return mid;
            } else if (sqr > n) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }

        return ans;
    }

    public static int sqrtN(long N) {
        return Math.toIntExact(binarySearch(N));
    }
}
