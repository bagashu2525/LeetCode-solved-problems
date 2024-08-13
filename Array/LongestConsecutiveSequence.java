import java.util.Arrays;
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int longseq=1,count=1,lastele;
        Arrays.sort(nums);
        if(nums.length<1){
            return 0;
        }
        lastele=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]==lastele+1){
                
                lastele=nums[i];
                count++;
            }
            else if(nums[i]!=lastele){
                count=1;
                lastele=nums[i];
            }
            if(longseq<count){
                longseq=count;
            }
            
        }
        
        return longseq;

    }
    public static void main(String[] args) {
        int[] mat = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(mat));
    }    
    
}

