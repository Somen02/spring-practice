package DataStructure.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;

        System.out.println("sum of all digits is "+sumOfdigits(n));
    }

    private static int sumOfdigits(int n) {

        if(n==0){
            return 0;
        }
        return (n%10)+sumOfdigits(n/10);
    }
}
