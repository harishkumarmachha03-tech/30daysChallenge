import java.util.*;
class LC_1480_RunningSumof1dArray {
    public static int[] runningSum(int[] nums) {
       int n=nums.length;
       int runningSum[] = new int[n];

       runningSum[0]=nums[0];

       for(int i=1;i<nums.length;i++){
        runningSum[i]=runningSum[i-1]+nums[i];
       }
       return runningSum;
       

    }public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int []result=runningSum(nums);
        System.out.println(Arrays.toString(result)+"");

    }
}
