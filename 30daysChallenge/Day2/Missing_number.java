public class Missing_number{

    public int missingNumber(int[] nums) {

        int n =nums.length;
        int actualsum=n*(n+1)/2;
        int orginalsum=0;
        for(int i=0;i<n;i++){
            orginalsum+=nums[i];
        }
int missingNumber=actualsum-orginalsum;
        return missingNumber ;
    }
    public static void main(String[] args) {
        int nums[]={1,2,4,5};
Missing_number obj =new Missing_number();

        int result=obj.missingNumber(nums);
        System.out.println(Math.abs(result)+"");
    }
}