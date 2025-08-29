class LC_408_Valid_Abbrevation {
    public static boolean validWordAbbreviation(String word, String abbr) {
        int i=0;
        int j=0;
        while(i<word.length()&&j<abbr.length()){
            if(Character.isDigit(abbr.charAt(j))){
                if(abbr.charAt(j)=='0'){
                    return false;
                }
                int num=0;
                while(j<abbr.length() && Character.isDigit(abbr.charAt(j))){
                    num=num*10+(abbr.charAt(j) - '0');
                    j++;
                }
                i=i+num;
            }
            else{
                if(i>=word.charAt(i) && word.charAt(i)!=abbr.charAt(j)){
                    return false;
                }i++;
                j++;
            }
        }
        return i==word.length() && j==abbr.length();
    }
    public static void main(String[] args) {
        String word="internationalization";
        String abbr="i12iz4n";

        boolean result= validWordAbbreviation(word,abbr);
        System.out.println(result);
    }


}