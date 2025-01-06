package basic;

public class AllDivisorOfNumber {
    public static void main(String[] args) {
        int num=15;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
//                System.out.println(i);
                if(i!=num/i){
//                    System.out.println(num/i);
                }
            }

        }
        allDivisorSorted(num);
    }

    private static void allDivisorSorted(int num) {
        int i;
        for(i=1;i*i<num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
        i--;
        for(;i>=1;i--){
            if(num%i==0){
                System.out.println(num/i);
            }
        }
    }
}
