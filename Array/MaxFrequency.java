import java.util.Arrays;
class MaxFrequency{
    public int majorityElement(int[] nums) {
        int count=0,maxele=nums[0],max=0,i;
        Arrays.sort(nums);
        for(i=0; i<nums.length-1; i++){
            count++;
            if(nums[i]!=nums[i+1]){
                if(max<count){
                    max=count;
                    maxele=nums[i];
                    count=0;
                }
                
            }

            if((i+1)==nums.length-1){
                count++;
            }
        }
        if(max<count){
            max=count;
            maxele=nums[i-1];
            count=0;
        }
        return maxele;
    }
    public static void main(String[] args){
        int[] arr ={2,2,1,1,1,2,2};
        MaxFrequency ob= new MaxFrequency();
        int ab = ob.majorityElement(arr);
        System.out.println(ab);
    }
}
