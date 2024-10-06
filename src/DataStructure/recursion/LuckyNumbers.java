package DataStructure.recursion;

public class LuckyNumbers {

    public static void main(String[] args) {

        int n=19;

        System.out.println("The number "+n+" is lucky : "+isLucky(n));
    }

    private static boolean isLucky(int n) {

        return check(n,2);
    }

    private static boolean check(int n, int pos){
        if(pos<=n){
            if(n%pos==0){
                return false;
            }
            n=n-n/pos;
            pos++;
            return check(n,pos);
        }else{
            return true;
        }
    }
}
