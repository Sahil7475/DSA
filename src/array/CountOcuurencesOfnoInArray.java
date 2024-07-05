package array;

public class CountOcuurencesOfnoInArray {


    public static int count(int arr[], int n, int x) {

        int count=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
}
