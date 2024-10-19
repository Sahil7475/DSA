package leetcode.arrays;


/*
* for rotated the array first goes in increasing order then the array has a break point
*  after which the array goes in decreasing order
* i/p :- [3,4,5,1,2]
* o/p :- true
* https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
* */
public class checkIfArrayIssortedAndrotated {
    public boolean check(int[] arr) {
        int countBreak = 0;
        int n=arr.length;

        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                countBreak++;
            }
        }

        if(arr[n-1]>arr[0]){
            countBreak++;
        }



        return countBreak <= 1;
    }

}
