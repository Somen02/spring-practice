package DataStructure.recursion;

public class SubsetSumProblem {

    public static void main(String[] args) {
        int [] ar={10,20,15};
        int n=ar.length;
        int sum=25;

        System.out.println("number of subset having the sum equal to given sum are: "+countSubset(ar,n,sum));

    }

    private static int countSubset(int[] ar, int n, int sum) {
        if(n==0){
            return sum==0?1:0;
        }

        return countSubset(ar,n-1,sum)+
                countSubset(ar,n-1,sum-ar[n-1]);

    }
}
