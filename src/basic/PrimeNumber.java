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

    }

}
