package DataStructure.recursion;

public class JosephusProblem {
    public static void main(String[] args) {
        int n=5;
        int k=3;

        System.out.println("The chosen place is "+josephus(n,k));
    }

    private static int josephus(int n, int k) {

        if(n==1){
            //if position starts from 0
//            return 0;
            return 1;
        }
        //if position starts from 0
//        return (josephus(n-1,k)+k)%n;
        //if position starts from 1
        return (josephus(n-1,k)+k-1)%n + 1;

    }
}
