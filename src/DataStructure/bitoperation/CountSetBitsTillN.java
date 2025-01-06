package DataStructure.bitoperation;

public class CountSetBitsTillN {

    public static void main(String[] args) {
        int n=11;

        int sum=countSetBits(n);
        System.out.println("Total number of set bits till n natural number is: "+sum);
    }

    private static int countSetBits(int n) {

        if(n<=1){
            return n;
        }
        int x= getLeftMostBitIndex(n);
        int countSum=0;
        countSum = (x*(1<<(x-1))) // from 0 to 2^x we have a pattern where half are set in one column so x column will have (x* 2^x) /2
                + (n-(1<<x)+1) //now the left out part that is n-2^x will have all lefmostbit as 1 so we will add totalnumber left +1
                + countSetBits(n-(1<<x)); //recursvie call for the left out part that is n-2^x we will follow same method.
        return countSum;

    }

    private static int getLeftMostBitIndex(int n) {

        int x=-1;
        while(n>0){
            n=n>>1;
            x++;
        }
        return x;
    }
}
