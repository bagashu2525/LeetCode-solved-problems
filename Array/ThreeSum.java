import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    //bruteforce approach
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> lli = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if((nums[i]+nums[j]+nums[k])==0)
                    {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        temp.sort(null);
                        lli.add(temp);
                    }

                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(lli);
        return ans;
    }
    public List<List<Integer>> threeSum2(int[] nums) {
        Set<List<Integer>> lli = new HashSet<>();
        for(int i=0;i<nums.length;i++){
             Set<Integer> hashset = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third = -(nums[i] + nums[j]);
                if(hashset.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                        temp.sort(null);
                        lli.add(temp);
                }
                hashset.add(nums[j])   ;
                    
            }
        }
        List<List<Integer>> ans = new ArrayList<>(lli);
        return ans;
    }
    public static void main(String[] args) {
        
    

    }
}
