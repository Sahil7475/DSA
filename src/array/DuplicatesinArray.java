package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicatesinArray {
    public static void main(String[] args) {
        int[] a= {4,3,2,7,8,2,3,1};

        // O(n2) approach
        boolean ifpresent=false;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){

                if(a[i]==a[j]){
                    if(al.contains(a[i])){
                        break;
                    }
                    else{
                        al.add(a[i]);
                        ifpresent=true;
                    }
                }
            }
        }
        if (ifpresent == true) {

            System.out.print(al + " ");
        }
        else {
            System.out.print(
                    "No duplicates present in arrays");
        }

        //o[n] approach
        HashSet<Integer> duplicates = new HashSet<>();
        HashSet<Integer> seen = new HashSet<>();

        for(int i=0;i<a.length;i++){
            if(seen.contains(a[i])){
                duplicates.add(a[i]);
            }else{
                seen.add(a[i]);
            }
        }
        System.out.println("array with O[n] approach");
        for (Integer num : duplicates) {
            System.out.print(num + ", ");
        }

        //best approach by babbar
        int ans = 0;
        for(int i =0;i<a.length;i++){
            ans = ans ^ a[i];
        }
        for(int i=1;i<a.length;i++){
            ans = ans ^ i;
        }

        System.out.println("ans by babbar" + ans);

        // new o(n) approach

            List<Integer> duplicates1 = new ArrayList<Integer>();

               for(int i=0;i<a.length;i++){
                 for(int j=i+1;j<a.length;j++){
                     if(a[i]==a[j]){
                         duplicates.add(a[i]);
                     }
                 }
               }

            Arrays.sort(a);

                for(int i=1;i<a.length;i++){
                    if(a[i]==a[i-1]){
                        if(duplicates1.isEmpty() || duplicates1.get(duplicates.size()-1)!=a[i]){
                            duplicates1.add(a[i]);
                        }
                    }
                }




    }
    public static void printArr(int a[]){
        System.out.println("th array is ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +", ");
        }
    }




}
