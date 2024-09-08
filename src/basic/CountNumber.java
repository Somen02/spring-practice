package basic;

//Write a Program to Count Number of digits in a Number.
//        Input: 1234
//Outpt: No of digits are = 4

//Write a Program to Count Number of Even and Odd Digits in a Number.
//Input: 1234
//Output: Even Numbers:2
//Odd Numbers: 2
public class CountNumber {

    public static void main(String args[]) {
        int number = 125534;
        System.out.println("number of digitsare : " + count(number));
        evenAndOdd(number);


    }

    private static void evenAndOdd(int number) {
        int countEven = 0;
        int countOdd = 0;
        while (number != 0) {
            int rem = number % 10;
            if (rem % 2 == 0) {
                countEven++;

            } else {
                countOdd++;
            }
            number /= 10;
        }
        System.out.println("number of even digit: " + countEven);
        System.out.println("number of odd digit: " + countOdd);
    }

    static int count(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
