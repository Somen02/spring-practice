package basic;

public class LowestCommonMultiple {
    public static void main(String[] args) {
        int a=4;
        int b=6;

        System.out.println("Lcm is "+naiveLcm(a,b));// O(m*n)
        System.out.println("Lcm is "+optimizedLcm(a,b));// O(log n)

    }

    private static int optimizedLcm(int a, int b) {

        //LCM is multiplication of two number divided by GCD
        return (a*b)/(int)GreatestCommonDivisor.optimizedGcd(a,b);
    }

    private static int naiveLcm(int a, int b) {
        int result = Math.max(a,b);

        while(true){
            if(result%a==0 && result%b==0){
                return result;
            }
            result++;
        }

    }
}
