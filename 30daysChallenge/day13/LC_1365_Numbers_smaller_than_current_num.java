import java.util.*;
public class LC_1365_Numbers_smaller_than_current_num {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int result[]=new int[nums.length];
      
        for(int i=0;i<nums.length;i++){
            int count=0;
        for(int j=0;j<nums.length;j++){
            if(j!=i && nums[j]<nums[i])
            {
                   count++;
            }
            
        }result[i]=count;

        }return result;
    }
    public static void main(String[] args) {
        int []nums={8,1,2,2,3};
        int []result=smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }
}