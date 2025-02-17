import java.util.HashMap;

public class CountSubarraySum{
    public int subarraySum(int[] nums, int k) {
        int presum=0,count=0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int i=0; i<nums.length; i++){
            presum+=nums[i];
            int difference = presum - k;
            if(mp.containsKey(difference)) 
                count+=mp.get(difference);
            if(mp.containsKey(presum)) 
                mp.replace(presum,mp.get(presum)+1);
            else
                mp.put(presum,1);

        }
        return count;
    }
    public static void main(String[] args) {
        CountSubarraySum ob = new CountSubarraySum();
        int[] nums={1,2,3};int k=3;
        System.out.println(ob.subarraySum(nums,k));;
    }
}