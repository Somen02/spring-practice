package basic;

//Write a Program to find Factorial of a Number.
//        Input: 5
//Output: 120
public class Factorial {

    public static void main(String args[]) {

        int number=5;

        System.out.println("Factorial of "+number+" is :" + facto(number));

    }
    static int facto(int num){
        if(num==0){
            return 1;
        }
        else{
            return num*facto(num-1);
        }
    }
}
