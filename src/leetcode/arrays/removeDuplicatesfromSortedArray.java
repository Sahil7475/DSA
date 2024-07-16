package leetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicatesfromSortedArray {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
    public int removeDuplicatesfromUnsorted(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            if (!map.containsKey(nums[i])) {
                 map.put(nums[i], nums[i]);
                 nums[j] = nums[i];
                 j++;
            }
        }
        return j;
    }



}
