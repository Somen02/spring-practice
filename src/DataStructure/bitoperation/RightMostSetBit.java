package DataStructure.bitoperation;

public class RightMostSetBit {

    public static void main(String[] args) {
        int n=18;

        //Position of rightmost set bit
        posRightMostSetBit(n);
    }

    private static void posRightMostSetBit(int n) {

        int pos=1;
        int m=1;

        while((n&m)==0){
            m=m<<1;
            pos++;
        }
        System.out.println("position is: "+pos);
    }
}
