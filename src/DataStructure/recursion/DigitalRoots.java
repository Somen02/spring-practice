package DataStructure.recursion;

public class DigitalRoots {
    public static void main(String[] args) {
        int num=99999;

        System.out.println(figit(num));


    }

    public static int figit(int n){
        if(n>=10)
        {
            return figit(findDigitalRoot(n));
        }
        return n;
    }
    public static int findDigitalRoot(int n)
    {
        // add your code here
        int sum=0;

        if(n<=9)
            return n;

        sum=(n%10)+findDigitalRoot(n/10);

        return sum;


    }
}
