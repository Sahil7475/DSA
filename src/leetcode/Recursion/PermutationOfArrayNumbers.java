package leetcode.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfArrayNumbers {
    public static void main(String[] args) {

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int index=0;
        solve(ans,index,nums);
        return ans;
    }

    public static void solve(List<List<Integer>> ans,int index,int[] nums){
        //base case
        if(index >= nums.length){
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            ans.add(permutation);
            return;
        }

        for(int j=index;j<nums.length;j++){
            swap(nums,index,j);
            solve(ans,index+1,nums);
            //backtrack
            swap(nums,index,j);
        }
    }

    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
