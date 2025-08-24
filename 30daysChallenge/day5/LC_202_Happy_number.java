import java.util.*;
class LC_202_Happy_number {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=sumofsquares(n);
          
        }
        return n==1;

 


    }
    private static int sumofsquares(int n){
        int sum=0;
        while(n!=0){
            int digits =n%10;
            sum+=digits*digits;
            n/=10;
            
        }return  sum;
    }
    public static void main(String[] args) {
        LC_202_Happy_number obj=new LC_202_Happy_number ();
        int n=19;
        boolean result=obj.isHappy(n);
        System.out.println(result);
    }
}