
import java.util.*;

public class containsduplicate {
    public boolean containsDuplicate(int[] nums) {

    //firt approach use sorting
    
       /* Arrays.sort(nums);
        int n =nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
           
        }return false;

        */

        //second approach using hashmap

        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                return true;
            }else{
                mp.put(nums[i],i);
            }
          
        }return false;


    }
    public static void main(String[] args) {
        int nums[]={1,2,3,2,4};
        containsduplicate obj=new containsduplicate();
         boolean result=obj.containsDuplicate(nums);
         System.out.println(result+"");
    }
}