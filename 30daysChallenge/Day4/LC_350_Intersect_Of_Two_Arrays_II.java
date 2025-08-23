import java.util.*;

public class LC_350_Intersect_Of_Two_Arrays_II{
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

   
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1); 
            }
        }

        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
    public static void main(String[] args) {
     LC_350_Intersect_Of_Two_Arrays_II sol = new LC_350_Intersect_Of_Two_Arrays_II ();

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
      
        System.out.println(Arrays.toString(sol.intersect(nums1, nums2))); 
}
}