package basic;

import java.util.Arrays;

// Java program to print all primes smaller than or equal to
// n using Sieve of Eratosthenes
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n=100;

        printAllPrimeNumbers(n);//O(nloglogn)
    }

    private static void printAllPrimeNumbers(int n) {

        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);

        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j=j+i){
                    prime[j]=false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(prime[i]){
                System.out.println(i);
            }
        }
    }
}
