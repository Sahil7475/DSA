package array;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueElementInArray {
    public static void main(String[] args) {
        int[] a= {4,3,2,7,8,2,3,1};

        HashSet<Integer> seen = new HashSet<>();

        for(int i=0;i<a.length;i++){
            if(!seen.contains(a[i])){
                seen.add(a[i]);
            }
        }
        System.out.println("array with O[n] approach");
        for (Integer num : seen) {
            System.out.print(num + ", ");
        }

        //another approach with O[n] tc and
        // O[1] sc

        System.out.println("by xor");
        System.out.println(findunique(a,a.length));


    }

    public static int findunique(int[] arr,int size){
        int ans=0;
        for(int i=0;i<size;i++){
            ans = ans ^ arr[i]; // we do xor coz if same number is xor with its own number then it gives us zero
        }
        return  ans;
    }



}
