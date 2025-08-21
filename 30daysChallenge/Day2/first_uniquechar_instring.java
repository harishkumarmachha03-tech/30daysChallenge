
import java.util.*;

public class first_uniquechar_instring {
    public int firstUniqChar(String s) {

        Map<Character,Integer> hm=new HashMap<>();

        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
    
        }
        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i))==1){
                return i;
            }

        }return -1;

    }public static void main(String[] args) {
        first_uniquechar_instring obj =new first_uniquechar_instring();
        String s ="leetcode";
        int result=obj.firstUniqChar(s);
        System.out.println(result+"");

     }
}