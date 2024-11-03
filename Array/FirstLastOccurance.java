public class FirstLastOccurance {
    public static int[] binarySearch(int []nums, int target){
        int l=0;
        int h=nums.length-1;
        int mid=-1;
        int index=-1;
        while(l<=h){
            mid=(l+h)/2;
            
            if(nums[mid]== target){
                index=mid;
                break;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        int start=index;
        int end=index;
        if(index!=-1){
            
            while(target== nums[start] ){
                start--;
                if(start<0)
                break;
            }
            start=start+1;

            while(target== nums[end] ){
                end++;
                if(end>nums.length-1)
                break;
            }
            end=end-1;
        
        }
        
        int []ans={start,end};
        return ans;
    }
    public static void main(String []args){
        int []nums={5,7,7,8,8,10};
        int target=8;
        int [] ans=binarySearch(nums,target);
         for(int e : ans)
         System.out.println(e);
    }
}
