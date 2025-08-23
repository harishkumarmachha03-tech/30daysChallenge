//first approach for extra space -most efficient 

class LC_136_singlenumber {
    public int singleNumber(int[] nums) {
        int result=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            result^=nums[i];
        }return result;
    }

    public static void main(String[] args) {
        LC_136_singlenumber obj =new LC_136_singlenumber();
        int []nums={2,2,1};
        int result=obj.singleNumber( nums);
        System.out.println(result+""); 
    }
}



//second approach using hashmap;
/*

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
    
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }return -1;
    }
}*/