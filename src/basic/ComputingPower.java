package basic;

public class ComputingPower {
    public static void main(String[] args) {
        long x=4;
        int n=4;// this will be the power

        long result=1;
        while(n>0){
            if(n%2!=0){ //alternate of this condition is (n & 1==1)
                result=result*x;
            }
            x=x*x;
            n=n>>1;
        }
        System.out.println(result);
    }
}
