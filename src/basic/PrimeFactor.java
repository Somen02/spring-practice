package basic;

import java.io.IOException;
import java.nio.file.DirectoryStream;

public class PrimeFactor {
    public static void main(String[] args) {
        int n=450;
        getPrimeFactorsNaive(n);
        System.out.println();
        getPrimeFactorsOptimized(n);
    }

    private static void getPrimeFactorsOptimized(int n) {
        if(n<=1)
            return;
        while(n%2==0){
            System.out.print(2+",");
            n=n/2;
        }
        while(n%3==0){
            System.out.print(3+",");
            n=n/3;
        }
        for(int i=5;i*i<=n;i=i+6){
            while(n%i==0)
            {
                System.out.print(i+",");
                n=n/i;
            }
            while(n%(i+2)==0){
                System.out.print(i+",");
                n=n/i;
            }
        }
        if(n>3){
            System.out.print(n);
        }
    }

    public static void getPrimeFactorsNaive(int n) {

        for (int i=2 ; i<n; i++){
           

            if(PrimeNumber.isPrimeMoreOptimized(i)){
                int x=i;
                while (n%x==0)
                {
                    System.out.print(i+",");
                    x=x*i;
                }

            }

        }

    }
}
