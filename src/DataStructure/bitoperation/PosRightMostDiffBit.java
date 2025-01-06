package DataStructure.bitoperation;

public class PosRightMostDiffBit {
    public static void main(String[] args) {
        int m=11;
        int n=9;

        int difference= posOfRightMostDiffBit(m,n);
        System.out.println("the first right most position bit difference is : "+difference);
    }
    public static int posOfRightMostDiffBit(int m, int n)
    {

        // Your code here
        if(m==n){
            return -1;
        }
        int number=m^n;
        // int count=1;
        // int temp=1;

        // while((number&temp) ==0){
        //     temp=temp>>1;
        //     count++;
        // }
        // return count;
        return (int)((Math.log10(number&-number))/Math.log10(2))+1;

    }
}
