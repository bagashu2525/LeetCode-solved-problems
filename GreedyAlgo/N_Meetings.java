/*
 * Given one meeting room and N meetings represented by two arrays, start and end, where start[i] 
 * represents the start time of the ith meeting and end[i] represents the end time of the ith meeting, 
 * determine the maximum number of meetings that can be accommodated in the meeting room if only one meeting 
 * can be held at a time.
 * 
 * Input : Start = [1, 3, 0, 5, 8, 5] , End = [2, 4, 6, 7, 9, 9]

Output : 4

Explanation : The meetings that can be accommodated in meeting room are (1,2) , (3,4) , (5,7) , (8,9).
 */

package GreedyAlgo;

import java.util.Comparator;

public class N_Meetings {
    public int maxMeetings(int[] start, int[] end) {
       //your code goes here
       Item[] arr=new Item[start.length];
        for(int i=0; i<start.length; i++){
            arr[i]= new Item(start[i],end[i]);
        }

        int cnt=0;
        int freetime=0;
        for(int i=0;i<start.length;i++){
            if(freetime<arr[i].start){
                cnt++;
                freetime=arr[i].end;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        N_Meetings obj = new N_Meetings();
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        System.out.println(obj.maxMeetings(start, end)); // Output: 4
    }
}
class SortItems implements Comparator<Item>{
    public int compare (Item a, Item b){
        if(a.end>b.end) return 1;
        else if(a.end==b.end) return 0;
        return -1;
    }
}
class Item{
    int start;
    int end;
    Item(int start,int end){
        this.start=start;
        this.end=end;

    }
}

