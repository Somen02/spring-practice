package DataStructure.arrays;

public class MaxIndexDifference {
    public static void main(String[] args) {
        int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int n = arr.length;
        int maxDiff = maxIndexDiff(arr, n);
        System.out.print(maxDiff);
    }

    private static int maxIndexDiff(int[] arr, int n) {
        int max_diff=Integer.MIN_VALUE;

        int[] rightMax=new int[n];

        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }

        int i=0;
        int j=0;
        while(i<n && j<n){
            if(arr[i]<=rightMax[j]){
                max_diff=Math.max(max_diff,j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return max_diff;
    }
}
