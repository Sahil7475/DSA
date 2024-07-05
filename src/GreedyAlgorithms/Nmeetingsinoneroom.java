package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.*;

public class Nmeetingsinoneroom {


   public static int maxMeetings(int[] start,int[] end,int n){
       class  Pair{
           int start,end;
           Pair(int start,int end){
               this.start=start;
               this.end=end;
           }
       }

       Comparator<Pair> cmp = new Comparator<Pair>() {
           @Override
           public int compare(Pair o1, Pair o2) {
               return o1.end - o2.end;
           }
       };
       List<Pair> v = new ArrayList<>();
       for(int i=0;i<n;i++){
            v.add(new Pair(start[i],end[i]));
       }

       Collections.sort(v, cmp);

       int count = 1;
       int ansEnd = v.get(0).end;

       for (int i = 1; i < n; i++) {
           // If this meeting starts after the last meeting ends, include it
           if (v.get(i).start > ansEnd) {
               count++;
               ansEnd = v.get(i).end;
           }
       }
           return count;

   }




    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        int n = start.length;
        System.out.println(maxMeetings(start,end,n));
    }
}
