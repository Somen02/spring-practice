package DataStructure.bitoperation;

public class GrayToBinary {
    public static void main(String[] args) {

        System.out.println("gray to binary of"+grayToBinary(15));
        System.out.println("Binary to gray of"+binaryToGray(10));
    }

    private static int binaryToGray(int i) {
        return i^ (i>>1);
    }

    public static int grayToBinary(int n) {

        //first set the MSB
        int res=n;
        while(n>0){
            //one by one we will right shift 1 bit and xor with the number n
            n=n>>1;
            res=res^n;
        }

        return res;

    }
}
