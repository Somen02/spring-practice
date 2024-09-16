package basic;

import java.io.IOException;
import java.nio.file.DirectoryStream;

public class PrimeFactor {
    public static void main(String[] args) {
        int n=122;
        getPrimeFactorsNaive(n);
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
