package GreedyAlgo;

import java.util.ArrayList;
import java.util.List;

/*
 * Problem 57: Insert Interval
 * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
 * Return intervals after the insertion.
 * Note that you don't need to modify intervals in-place. You can make a new array and return it.
 */
public class Intervals {
    public int[][] insert1(int[][] intervals, int[] newInterval) {
        List<int[]> temp = new ArrayList<>();
        int i=0,n=intervals.length;
        //identifying the left section
        while(i<n && intervals[i][1]<newInterval[0]){
            temp.add(intervals[i]);
            i++;
            
        }
        //overlapping section
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        temp.add(newInterval);
    
        while(i<n){
            temp.add(intervals[i]);
            i++;
        }
        return temp.toArray(new int[temp.size()][]);
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> temp = new ArrayList<>();
        int i=0,n=intervals.length;
        //identifying the left section
        while(i<n && intervals[i][1]<newInterval[0]){
            List<Integer> lt = new ArrayList<>();
            lt.add(intervals[i][0]);
            lt.add(intervals[i][1]);
            temp.add(lt);
            i++;
            
        }
        //overlapping section
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        List<Integer> lt = new ArrayList<>();
        lt.add(newInterval[0]);
        lt.add(newInterval[1]);
        temp.add(lt);
    
        while(i<n){
            lt = new ArrayList<>();
            lt.add(intervals[i][0]);
            lt.add(intervals[i][1]);
            temp.add(lt);
            i++;
        }
        int[][] res = new int[temp.size()][2];
        for(i=0;i<temp.size();i++){
           List<Integer> innerList = temp.get(i);
            for (int j = 0; j < innerList.size(); j++) {
                res[i][j] = innerList.get(j);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Intervals obj = new Intervals();
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] result = obj.insert(intervals, newInterval);
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }

        result = obj.insert1(intervals, newInterval);
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
