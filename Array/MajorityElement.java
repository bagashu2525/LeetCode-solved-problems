import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {
    //better solution
    public static List<Integer> majorityElement1(int[] nums) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(mp.containsKey(nums[i]))
                mp.put(nums[i],mp.get(nums[i])+1);
            else
                mp.put(nums[i],1);
        }
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){
            //System.out.println(e.getKey()+":"+e.getValue());
            if(e.getValue()>(nums.length/3))
                list.add(e.getKey());
        }

        return list;
    }
    //optimal solution
    public static List<Integer> majorityElement2(int[] nums){
        List<Integer> list = new ArrayList<>();
        int el1=Integer.MAX_VALUE,cnt1=0,el2=Integer.MIN_VALUE,cnt2=0;
        //finding the majority elements
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && el2!=nums[i]){
                cnt1=1;el1=nums[i];
            }
            else if(cnt2==0 && el1!=nums[i]){
                cnt2=1;el2=nums[i];
            }
            else if(el1==nums[i]) cnt1++;
            else if(el2==nums[i]) cnt2++;
            else{
                cnt1--;cnt2--;
            }

        }

        //validation
        cnt1=0;cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1) cnt1++;
            if(nums[i]==el2) cnt2++;
        }

        if(cnt1>(nums.length/3)) list.add(el1);
        if(cnt2>(nums.length/3)) list.add(el2);
        return list;
    } 

    public static void main(String[] args){
        int[]nums = {2,2,3};
        List<Integer> list=majorityElement2(nums);
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
