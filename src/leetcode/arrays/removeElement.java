package leetcode.arrays;

/*
* returns the index of array after removing the val element from array
* */

public class removeElement {
    public static void main(String[] args) {

    }
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}