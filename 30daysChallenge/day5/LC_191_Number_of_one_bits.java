class  LC_191_Number_of_one_bits{

    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            count+=(n&1);
            n>>>=1;// This is unsigned right shift operator used to shift  bits to  right side and fill left most bit with 0.
            

        }
        return count;
        
    }public static void main(String[] args) {
        int n=11;
        LC_191_Number_of_one_bits obj = new LC_191_Number_of_one_bits();
        System.out.println(obj.hammingWeight(n));
    }
}