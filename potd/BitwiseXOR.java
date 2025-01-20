package potd;

import java.util.HashMap;
import java.util.Map;

/*You are given two 0-indexed arrays, nums1 and nums2, consisting of non-negative integers.
 There exists another array, nums3, which contains the bitwise XOR of all pairings of integers
  between nums1 and nums2 (every integer in nums1 is paired with every integer in nums2 exactly once).

Return the bitwise XOR of all integers in nums3. */
public class BitwiseXOR {
    public int xorAllNums(int[] nums1, int[] nums2) {
        //int sor=0
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         int temp=(nums1[i]^nums2[j]);
        //         xor=(xor^temp);
        //     }
        // }
        //return xor;
        int len1=nums1.length,len2=nums2.length;
        int ans=0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<len1;i++){
            if(hashMap.get(nums1[i])!=null){
                hashMap.put(nums1[i],hashMap.get(nums1[i])+len2);
            }
            else{
                hashMap.put(nums1[i],len2);
            }
        }
            
        for(int i=0;i<len2;i++){
           if(hashMap.get(nums2[i])!=null) {
                hashMap.put(nums2[i],hashMap.get(nums2[i])+len1);
           }
           else{
                hashMap.put(nums2[i], len1);

           }
        }
        for (Map.Entry<Integer, Integer> e : hashMap.entrySet())
            //System.out.println("Key: " + e.getKey()+ " Value: " + e.getValue());
            if(e.getValue()%2!=0){
                ans=(ans^e.getKey());
            }
        
        return ans;
    }
    public static void main(String[] args) {
        /*
        Bitwise XOR operation
         * int a=2; 
         * int b=7;
         * System.out.println("a^b = " + (a ^ b)); 
         */
        BitwiseXOR ob= new BitwiseXOR();
        int[] nums1 ={8,6,29,2,26,16,15,29};
        int[] nums2 ={24,12,12};
        System.out.println(ob.xorAllNums(nums1, nums2));
    }
}

/*Algorithm
Initialize two variables len1 and len2 to store the lengths of the input arrays nums1 and nums2 respectively.
Initialize a hashmap freq to store the frequency of each number's appearances in the final XOR computations.
Iterate through each number in the first array nums1:
For each number, add it to the frequency map with a count equal to len2.
Iterate through each number in the second array nums2:
For each number, add it to the frequency map with a count equal to len1.
Initialize a variable ans to store the final result, starting with 0.
Iterate through the frequency map's keys:
For each number, check if its frequency is odd.
If odd, XOR the number with the current value of ans.
Return the final computed XOR value stored in ans. */
