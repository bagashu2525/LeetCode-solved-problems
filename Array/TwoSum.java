import java.util.Arrays;
public class TwoSum { 
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=nums.length-1,flag=1;
        int[] newnums = new int[nums.length];
        for(int l = 0 ; l<nums.length; l++){
            newnums[l]=nums[l];
        }
        Arrays.sort(newnums);
        while(i<j){
            if(newnums[i]+newnums[j]==target)
                break;
            else if(newnums[i]+newnums[j]<target)
                i++;
            else
                j--;
        }
        int []index = new int[2];
        for(int k=0; k<nums.length; k++){
            if(nums[k] == newnums[i] && flag==1){
                index[0]=k;
                // System.out.println("0index"+index[0]);
                flag=0;
            }
            else if(nums[k] == newnums[j]){
                index[1]=k;
                // System.out.println("1index"+index[1]);
            }
            // System.out.println(index[0]+" "+index[1]);
        }
        
        return index;
    }
    public static void main(String[] args){
        int[] arr ={2,5,5,11};
        TwoSum ob = new TwoSum();
        int []ab = ob.twoSum(arr,10);
        System.out.println(ab[0]+" "+ab[1]);
    }
}