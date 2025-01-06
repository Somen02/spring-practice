package DataStructure.bitoperation;

public class CheckSetOrNot {
    public static void main(String[] args) {
        int n= 5;
        int k=3;

        checkKthBitSetOrNotNaive(n,k);
        checkKthBitSetOrNotEfficeint(n,k);
    }

    private static void checkKthBitSetOrNotEfficeint(int n, int k) {
        int x= (1<<(k-1)); // we left shift 1 to k-1 times which will give us 2 power of k-1

        if((n&x)!=0){
            System.out.println("Kth bit is set");
        }else{
            System.out.println("Kth bit is not set");
        }
    }

    private static void checkKthBitSetOrNotNaive(int n, int k) {

        int x=1;

        for(int i=0;i<(k-1);i++){
            x=x*2;
        }

        if((n&x)!=0){
            System.out.println("Kth bit is set");
        }else{
            System.out.println("Kth bit is not set");
        }
    }
}
