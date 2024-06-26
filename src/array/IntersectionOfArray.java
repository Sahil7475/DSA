package array;

import java.util.ArrayList;
/*Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.*/


public class IntersectionOfArray {
    public int[] intersection(int[] a, int[] b) {

        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    if(!arr.contains(a[i])){
                        arr.add(a[i]);
                    }
                    break;
                }
            }
        }

        int[] result = new int[arr.size()];
        for(int k = 0; k < arr.size(); k++) {
            result[k] = arr.get(k);
        }
        return result;
    }
}
