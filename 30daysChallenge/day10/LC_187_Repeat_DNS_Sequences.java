import java.util.*;
class LC_187_Repeat_DNS_Sequences {
    public  static List<String> findRepeatedDnaSequences(String s) {
         HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();
        int n = s.length();

        for (int i=0;i<=n-10;i++) 
        {
            String sub = s.substring(i, i + 10);
            if (seen.contains(sub)) repeated.add(sub);
            
            else {
                seen.add(sub);
            }

        }
        return new ArrayList<>(repeated);
    }
    public static void main(String[] args) {
        String s="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> result =findRepeatedDnaSequences( s);
        System.out.println(result);
    }
}