package DataStructure.bitoperation;

public class Sparse {

    public static void main(String[] args) {
        int N=4;

        if(isSparse(N)){
            System.out.println("It is sparse and no two consecutive 1's bit are there");
        }
        else{
            System.out.println("not sparse");
        }

    }

    public static boolean isSparse(int n)
    {
        // to check whether two consecutive bits are 1 or not
        if((n&(n>>1)) >= 1){
            return false;
        }
        return true;
    }

}
