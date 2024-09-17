package GreedyAlgo;

public class JumpGame2 {
    public static void main(String[] args) {
        int maxIndex=0;
        int count=0;
        int[] nums={0};
        for(int i=0; i<nums.length; i++){
            count++;
            if(maxIndex>=i){
                int temp= i+nums[i];
                if(temp>maxIndex){
                    maxIndex=temp;
                    System.out.println(maxIndex+" "+count);
                    if(maxIndex>=nums.length-1) {

                        break;
                    }

                }
            }
            else
                System.out.println("0");
            
        }
        System.out.println(count);
    }
}
