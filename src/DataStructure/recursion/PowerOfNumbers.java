package DataStructure.recursion;

public class PowerOfNumbers {

    public static void main(String[] args) {
        System.out.println(power(5,4));
    }
    public static long modfun(long n, long  R)
    {
        // Base cases
        if (n == 0)
            return 0;
        // power zero mean answer is 1
        if (R == 0)
            return 1;
        // If R is even
        long y;
        long m=(long)Math.pow(10,9)+7;
        if (R % 2 == 0) {
            // finding r/2 power as power is even then storing answer in y and if power is even like 2^4 we can simply do (2^2)*(2^2)
            y = modfun(n, R/2);
            y = (y * y) % m;
        }

        // If R is odd
        else {
            y = n % m;
            // reduce the power by 1 to make it even. The reducing power by one can be done if we take one n out. Like 2^3 can be written as 2*(2^2)
            y = (y * modfun(n, R - 1) % m) % m;
        }
        // finally return the answer (y+mod)%mod = (y%mod+mod%mod)%mod = (y%mod)%mod
        return ((y + m) % m);
    }


    static long power(int N,int R)
    {
        return modfun(N,R)%1000000007;

    }
}
