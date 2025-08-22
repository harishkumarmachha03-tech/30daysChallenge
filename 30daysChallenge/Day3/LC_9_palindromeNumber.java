 class LC_9_palindromeNumber  {
    public boolean isPalindrome(int x) 
        { 
            int orginal=x;
            int reversed=0;
        
          while(x>0){
            int digits =x%10;
            reversed =(reversed*10)+digits;
            x/=10;

          }
          if(orginal==reversed){
            return true;


          }else{
            return false;
          }


        }public static void main(String[] args) {
            
        LC_9_palindromeNumber obj =new LC_9_palindromeNumber();
            int x=121;
            boolean check=obj.isPalindrome(x);
            System.out.println(check);

        }

}