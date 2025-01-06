package DataStructure.bitoperation;

public class SwapBit {
    public static void main(String[] args) {
        int n= 23;

       int num= swapBits(n);
        System.out.println(num);
    }
    public static int swapBits(int n)
    {
        //get all even bits
        int evenbits = n & 0xAAAAAAAA;

        // Get all odd bits of x
        int oddbits = n & 0x55555555;

        // Right shift even bits
        evenbits >>= 1;

        // Left shift even bits
        oddbits <<= 1;

        // Combine even and odd bits
        return (evenbits | oddbits);
    }
}
