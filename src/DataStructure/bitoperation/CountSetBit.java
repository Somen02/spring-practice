package DataStructure.bitoperation;

public class CountSetBit {
    public static void main(String[] args) {
        int n=100;

        countSetBitNaive(n);// time complexity is theta(d)
        brianKernigansAlgo(n);// time complexity is theta(set Bits)
    }

    private static void brianKernigansAlgo(int n) {
        int res=0;
        while(n>0){
            n=n&(n-1);
            res=res+1;
        }
        System.out.println("The number of bits set are: "+res);
    }

    private static void countSetBitNaive(int n) {
        int result=0;
        while(n>0){
            if((n&1)==1){
                result++;
            }
            n=n>>1;
        }
        System.out.println("The number of bits set are: "+result);
    }
}
