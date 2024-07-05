package array;

public class GenerateSubArrayAndCheckforSum {
    public static void main(String[] args) {
        int[] arr={2,5,1,10,10};
        int k=14;

        int i=0;
        int r=0;int sum=0;int maxlength=0;
        int n=arr.length;

        while(r<n){
            sum=sum+arr[r];
            // if in the output we have to return the subarray then we will
            // use while loop to shrink the array originally
            // tc o(n+n)
           /* while (sum>k){
                sum=sum-arr[r];
                i++;
            }*/

            //if we just have to find the length then just move the index
            // there is no need of shrinking the array
            // tc o(n)
            if (sum>k){
                sum=sum-arr[r];
                i++;
            }
            if(sum<=k){
                maxlength=Math.max(maxlength,r-i+1);
            }
            r++;
        }

        System.out.println(maxlength);
    }
}
