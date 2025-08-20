class LC_2235_1_Add_two_Integers{
    public int sum(int num1, int num2) {
       int sum=num1+num2;
       return sum;
        
    }
    public static void main(String[] args) {
        int num1=12,num2=15;
        LC_2235_1_Add_two_Integers obj =new LC_2235_1_Add_two_Integers();

        int result=obj.sum(num1,num2);
        System.out.println(result+"");
    }
}