package DataStructure.arrays;

public class RangeSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        int[] pre=new int[n];

        preCompute(arr,n,pre);
        System.out.println(sumRange(1,3,pre));
        System.out.println(sumRange(2,4,pre));
    }

    private static int sumRange(int i, int j, int[] pre) {
        if(i==0){
            return pre[j];
        }
        return pre[j]-pre[i-1];
    }

    private static void preCompute(int[] arr, int n, int[] pre) {
        pre[0]=arr[0];

        for(int i=1;i<n;i++){
            pre[i]=arr[i]+pre[i-1];
        }
    }
}
