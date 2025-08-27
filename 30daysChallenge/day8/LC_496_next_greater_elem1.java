
import java.util.Arrays;

class  LC_496_next_greater_elem1{
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            int nextgreater=-1;
            boolean seen=false;
          
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    seen = true;
                    for(int k=j+1;k<nums2.length;k++){

                    if(nums2[k]>nums1[i]){
                    nextgreater =nums2[k];
                    break;
                    }
                    }break;

                    
                }
            }ans[i]=nextgreater;
        }return ans;
    }
    public static void main(String[] args) {
        int nums1[]={4,1,2};
        int nums2[]={1,3,4,2};
        int res[]=nextGreaterElement(nums1,nums2);
        System.out.println(Arrays.toString(res));

    }
}