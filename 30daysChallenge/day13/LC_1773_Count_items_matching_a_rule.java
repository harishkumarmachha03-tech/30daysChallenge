import java.util.*;
public class LC_1773_Count_items_matching_a_rule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index=0;
        if(ruleKey.equals("type")){
            index=0;
        }else if(ruleKey.equals("color")){
            index=1;
        }else{
            index=2;
        }
        int count =0;

        for(List<String> item:items){
            if(item.get(index).equals(ruleValue)){
                count++;
            }
        }return count;
    }
    public static void main(String[] args) {
    

      List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        String ruleKey ="color";
        String ruleValue ="silver";
        System.out.println(countMatches(items,ruleKey,ruleValue)); 
    }
}