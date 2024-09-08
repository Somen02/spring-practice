package basic;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        long num1=12;
        long num2=28;

        System.out.println(naiveGcd(num1,num2));//O(n) time complexity
        System.out.println(eucledianGcd(num1,num2));//O(n) time complexity
        System.out.println(optimizedGcd(num1,num2));//O(log n) time complexity
    }

    public static long optimizedGcd(long num1, long num2) {

        if(num2==0)
            return num1;
        else
            return optimizedGcd(num2,num1%num2);
    }

    public static long eucledianGcd(long num1, long num2) {

        //here we check if a is greater than b or b is greater than a and keep on subtracting till we have a=b
        while(num1!=num2)
        {
            if(num1>num2){
                num1=num1-num2;
            }
            else {
                num2=num2-num1;
            }
        }
        return num1;
    }

    public static long naiveGcd(long num1, long num2) {
        long result=Math.min(num1,num2); // first get the smallest of the two number and check wheter the other number is divisible by it

        while(result>0)
        {
            if(num1%result==0 && num2%result==0) // loop in till 1 and check which number is divisible
                break;

            result--;
        }
        return result;
    }
}
