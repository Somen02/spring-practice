package basic;

public class PrimeNumber {

    public static void main(String args[]) {
        int start=2;
        int end=100;


        for(int i=start ; i<=end; i++){
            boolean prime=true;
            for(int j=2 ; j<=Math.sqrt(i) ; j++){
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                System.out.print(i+",");
            }

        }
        int num=12;
        System.out.println();
        System.out.println(num+" is prime: "+isPrimeNaive(num));//O(n) time complexity
        System.out.println(num+" is prime: "+isPrimeOptimized(num));//O(sqrt(n)) time complexity
        System.out.println(num+" is prime: "+isPrimeMoreOptimized(num));//O(sqrt(n)) time complexity but 3times more faster

    }

    public static boolean isPrimeMoreOptimized(int num) {
        if(num==1)
            return false;
        if(num==2 || num==3)
            return true;
        if(num%2==0 || num%3==0)
            return false;
        for (int i =5 ; i*i<= num;i=i+6){
            if(num%i==0 || num%(i+2)==0)
                return false;
        }
        return true;

    }

    public static boolean isPrimeOptimized(int num) {
        if(num==1)
            return false;
        else{
            for (int i = 2;i*i<=num;i++){
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isPrimeNaive(int num) {
        if(num==1)
            return false;
        else{
            for (int i = 2;i<num;i++){
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
    }

}
