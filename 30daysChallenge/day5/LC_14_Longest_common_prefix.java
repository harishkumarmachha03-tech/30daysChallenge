import java.util.*;
class LC_14_Longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
 int index=0;
 Arrays.sort(strs);
 String str1=strs[0];
 String str2=strs[strs.length-1];
 while(index<str1.length()){
    if(str1.charAt(index)==str2.charAt(index)){
        index++;
    }else{
        break;
    }

 }return index==0? "":str1.substring(0,index);

    }public static void main(String[] args) {
        LC_14_Longest_common_prefix obj = new LC_14_Longest_common_prefix();
        String strs[]={"flower","flow","flight"};
        String result=obj.longestCommonPrefix(strs);
        System.out.println(result);
    }
}