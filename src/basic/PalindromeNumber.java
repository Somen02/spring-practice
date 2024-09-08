package basic;

//Write a Program to Find Weather the Number is Palindrome or Not.
//Input: 1221
//Output: 1221 – is a Palindrome
public class PalindromeNumber {

    public static void main(String args[]) {

        int number = 1221;

        int reverse = 0;

//        int num=number;

        reverse = palindrome(number, 0);

//        while(number>0){
//            reverse = reverse * 10 + number % 10;
//            number=number/10;
//        }

        if (reverse == number) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }

    }

    static int palindrome(int n, int rev) {

        if (n < 10) {
            return rev * 10 + n;
        } else {
            rev = rev * 10 + n % 10;
            return palindrome(n / 10, rev);
        }

    }
}
