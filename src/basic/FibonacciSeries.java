package basic;

//Write a Program for Fibonacci Series.
//Ex- Fibonacci Series till 10 Terms:
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34
public class FibonacciSeries {

    public static void main(String args[]) {
        int n=10;

        System.out.println("series is :-");
        for(int i=0;i<n;i++){
            System.out.print(fibonac(i)+",");
        }

    }
    static int fibonac(int n){

        if(n<=1){
            return n;
        }
        return fibonac(n-1) + fibonac(n-2);
    }
}
