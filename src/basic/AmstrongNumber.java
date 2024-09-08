package basic;

//Write a Program to Check Number is Armstrong Number.
//        Input: 153
//Output: yes
//153 is an Armstrong Number
//1x1x1 + 5x5x5 + 3x3x3 = 153
public class AmstrongNumber {

    public static void main(String args[]) {

        int number= 153;

        if(isAmstrong(number)){
            System.out.println("It is an amstrong number");
        }
        else{
            System.out.println("not an amstrong number");
        }

    }

    static boolean isAmstrong(int number){
        int count= order(number);
        int temp=number;
        int sum=0;
        while(temp!=0){
            int r = temp%10;
            sum=sum+((int)Math.pow(r,count));
            temp/=10;
        }
        if(number==sum)
            return true;
        else
            return false;

    }

    static int order(int number){

        int order=0;
        while(number!=0){
            order++;
            number/=10;
        }
        return order;
    }
}
