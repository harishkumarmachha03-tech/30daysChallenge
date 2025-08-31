public class LC_367_Valid_Perfect_square {
    public static boolean isPerfectSquare(int num) {
    int digit = (int)Math.sqrt(num);

    return digit*digit==num;

        
    }
    public static void main(String[] args) {
        int num=16;
        System.out.println(isPerfectSquare(num));

    }
}