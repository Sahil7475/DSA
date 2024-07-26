package leetcode.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequences {
    public static void main(String[] args) {

    }
    public static ArrayList<String> subsequences(String str) {
        // Write your code here
        int index=0;
        String currentString="";
        ArrayList<String> ans = new ArrayList<>();
        solve(str,index,currentString,ans);
        return ans;
    }

    public static void solve(String str,int index,String currentString,ArrayList<String> ans){
        if (index == str.length()) {
            if (!currentString.isEmpty()) {
                ans.add(currentString);
            }
            return;
        }

        //exclude
        solve(str,index + 1,currentString,ans);

        //include
        char character = str.charAt(index);
        currentString = currentString + character;
        solve(str,index+1,currentString,ans);
    }
}
