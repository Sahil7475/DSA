package leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class checkInclusionOrPermutationOfStringSlidingWindow {
    public static void main(String[] args) {

    }

    // this approach gives memory limit exceeded since we are finding permutation of string then comparing
   /* public boolean checkInclusion(String s1, String s2) {
        List<String> permutations = new ArrayList<>();
        int index=0;
        generatePermutations(s1.toCharArray(), index, permutations);
        for (String perm : permutations) {
            if (s2.contains(perm)) {
                return true;
            }
        }
        return false;
    }

    public void generatePermutations(char[] chars, int index, List<String> permutations){
        // base case
        if(index==chars.length){
            permutations.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            generatePermutations(chars, index + 1, permutations);
            swap(chars, index, i); // Backtrack
        }

    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }*/

    // Sliding window approach or frequency based approach
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()){
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // populate frquency arrays for s1 and first window of s2

        for(int i=0;i<s1.length();i++){
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Slide the window over s2 and compare frequency arrays
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (areArraysEqual(s1Count, s2Count)) {
                return true;
            }
            // Move the window: remove the influence of the old character and add the new one
            s2Count[s2.charAt(i) - 'a']--;
            s2Count[s2.charAt(i + s1.length()) - 'a']++;
        }

        //check last window
        return areArraysEqual(s1Count,s2Count);
    }

    public boolean areArraysEqual(int[] arr1,int[] arr2){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }






}
