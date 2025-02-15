package potd;

import java.util.PriorityQueue;

public class Problem3066 {
    public static int minOperations(int[] nums, int k) {
        if(nums.length<2) return -1;
        int res=0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int n: nums){
            pq.add((long) n);
        }
        long a=0,b=0;
        while(pq.size() > 1 && pq.peek()<k){
            
            a=pq.poll();
            
                b=pq.poll();
                //min(x, y) * 2 + max(x, y)
                pq.add(Math.min(a,b)*2+ Math.max(a,b));
                res++;
            
            
            
        }
        return pq.peek()>=k?res:-1;
    }
    public static void main(String[] args) {
        int[] nums= {999999999, 999999999, 999999999};
        System.out.println(minOperations(nums,1000000000));
    }
}
