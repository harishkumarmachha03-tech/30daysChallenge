
import java.util.Arrays;

class  LC_1929_2_Concat_of_array {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        for(int i=0;i<n;i++)
        {
          ans[i]=nums[i];
          ans[i+n]=nums[i];
        }
        return ans;

    }
    public static void main(String[] args) {
      int nums[]={1,2,1};
       //if method is not static we have to declare object
        LC_1929_2_Concat_of_array obj=new LC_1929_2_Concat_of_array();
        int result []=obj.getConcatenation(nums);
        System.out.println("concatination of array:"+Arrays.toString(result));



       
    }
}