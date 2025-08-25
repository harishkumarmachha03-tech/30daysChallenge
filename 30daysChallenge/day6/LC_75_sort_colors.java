
import java.util.Arrays;

public class  LC_75_sort_colors{
    public void sortColors(int[] nums) {

        int red=0;
        int white=0;
        int n =nums.length;
        int blue=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                red++;
            }else if(nums[i]==1){
                white++;
            }else{
                blue++;
            }

        }for(int i=0;i<n;i++){
            if(i<red){
                nums[i]=0;
            }else if(i<red+white){
                nums[i]=1;
            }else{
                nums[i]=2;
            }
        }
    }public static void main(String[] args) {
        int [] nums={2,0,2,1,1,0};
         LC_75_sort_colors obj =new  LC_75_sort_colors();
      
        obj.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}