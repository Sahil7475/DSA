package array;

public class TwoSum {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;


        printArr(twoSum(n,arr,target));

    }
    public static int[] twoSum(int n, int []arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static int[] pairSum(int[] a,int n){

        int i=0;
        int j=n-1;
        int target = 12;
        int sum=a[i]+a[j];
        int[] ans = new int[2];

        while(i<j){
            if(sum==target){
                ans[0]=i;
                ans[1]=j;
            }else if(sum<target){

                i++;
            }else{
                j--;
            }
        }
        return ans;
    }

    public static void printArr(int a[]){
        System.out.println("th array is ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +", ");
        }
    }

}
