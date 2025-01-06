package DataStructure.bitoperation;

public class RightMostSetBit {

    public static void main(String[] args) {
        int n=100;

        //Position of rightmost set bit
        posRightMostSetBit(n);
    }

    private static void posRightMostSetBit(int n) {

        int pos=1;
        int m=1;

        if(n==0){
            System.out.println("position is: "+0);
            return;
        }
        while((n&m)==0){
            m=m<<1;
            pos++;
        }
        System.out.println("position is: "+pos);
    }
}
