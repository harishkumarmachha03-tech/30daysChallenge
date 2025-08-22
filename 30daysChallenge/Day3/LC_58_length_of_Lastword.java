

class LC_58_length_of_Lastword {
    public int lengthOfLastWord(String s) {
        int length=0;
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                length++;
            }else{
                break;
            }

        }return length;
    }public static void main(String[] args) {
        LC_58_length_of_Lastword obj=new LC_58_length_of_Lastword();
        String s ="Hello World ";
        System.out.println(obj.lengthOfLastWord(s));

    }
}