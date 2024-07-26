package leetcode.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {

    }

    public void solve(List<Integer> nums,List<Integer> output,int index,List<List<Integer>> ans){
        if(index >= nums.size()){
            ans.add(new ArrayList<>(output));
            return;
        }

        //Exclude
        solve(nums,output,index+1,ans);

        //Include
        int element = nums.get(index);
        output.add(element);
        solve(nums,output,index+1,ans);
    }

    public List<List<Integer>> subsets (List<Integer> nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index=0;
        solve(nums,output,index,ans);
        return ans;
    }
}
