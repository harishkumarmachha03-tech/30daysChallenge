
import java.util.HashMap;
import java.util.Map;
public class  LC_13_Roman_To_Integer{
    public int romanToInt(String s) {
      Map<Character,Integer> mp =new HashMap<>();
      mp.put('I',1);
      mp.put('V',5);
      mp.put('X',10);
      mp.put('L',50);
      mp.put('C',100);
      mp.put('D',500);
      mp.put('M',1000);

      int res=mp.get(s.charAt(s.length()-1));
      for(int i=s.length()-2;i>=0;i--){
        if(mp.get(s.charAt(i))< mp.get(s.charAt(i+1))){
            res-=mp.get(s.charAt(i));
        }else{
            res+=mp.get(s.charAt(i));
        }
      }return res; 
    }
    public static void main(String[] args) {
        LC_13_Roman_To_Integer obj=new LC_13_Roman_To_Integer();
        String s="LVIII";
        int result=obj.romanToInt(s);
        System.out.println(result);

        
    }
}