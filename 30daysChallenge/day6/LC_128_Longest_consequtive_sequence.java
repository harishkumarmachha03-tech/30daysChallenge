import java.util.*;
class LC_128_Longest_consequtive_sequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for(int num:nums){
            seen.add(num);
        }
        int longest=0;
      for(int i:seen){
        if(!seen.contains(i-1)){
           int  curr=i;
           int  len=1;
            while(seen.contains(curr+1)){
                curr++;
                len++;
            }
            longest=Math.max(len,longest);
        }

      }return longest;
    }
    public static void main(String[] args) {
        int nums[]={100,4,200,1,3,2};
        LC_128_Longest_consequtive_sequence obj =new LC_128_Longest_consequtive_sequence();
        int result=obj.longestConsecutive(nums); 
        System.out.println(result);
    }
}