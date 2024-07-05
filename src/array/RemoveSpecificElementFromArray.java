package array;

public class RemoveSpecificElementFromArray {
    public static void main(String[] args) {

        int[] arr={1,3,3,5,4};
        int target = 3;
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==target){
                index=i;
            }
        }
        //shifting elements
        for(int k=index;k<arr.length-1;k++){
            arr[k]=arr[k+1];
        }

        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }



    }


}
