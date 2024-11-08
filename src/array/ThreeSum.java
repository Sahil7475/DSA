package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int target =0;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int left=i+1;
            int right = nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while (left<right && nums[left] == nums[left+1]){
                        left++;
                    }

                    while (left<right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum<target){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return result;
    }
}
