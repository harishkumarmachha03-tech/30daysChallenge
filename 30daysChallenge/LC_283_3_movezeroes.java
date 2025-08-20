import java.util.Arrays;

class LC_283_3_movezeroes{
    public void moveZeroes(int[] nums) {
        int n =nums.length;
        int j=0;
        for(int i = 0;i<n;i++){
            if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }


        /*int n = nums.length;
        int k =0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[k++]=nums[i];
            }
        }while(k<n)
        {
            nums[k++]=0;
        }*/


    }
    public static void main(String[] args) {
    LC_283_3_movezeroes obj=new LC_283_3_movezeroes();
        int nums[]={0,1,0,3,12};
        obj.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}