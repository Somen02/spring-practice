package basic;

import java.util.Scanner;

public class TrailingZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number for factorial");
        int n =sc.nextInt();
        countZeros(n);
    }

    private static void countZeros(int n) {
        //to count the number of zeros we need to check for n numbers how many numbers are divisible by 5
        // if 25, 125 is there then number will have 2 5's

        int count=0;
        for(int i=5;i<=n;i=i*5){

            count += n/i;

        }

        System.out.println("Trailling zeros are:-"+count);
    }
}
