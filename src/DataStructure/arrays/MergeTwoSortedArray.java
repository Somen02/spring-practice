package DataStructure.arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] ar1 = {1, 3, 5, 7};
        int[] ar2 = {2, 4, 6, 8};
        int[] ar3 = new int[ar1.length + ar2.length];

        mergeArray(ar1,ar2,ar3);
        for (int num:ar3){
            System.out.println(num);
        }

        int[] r= new int[3];
        r[0]=1;
        r[1]=2;


    }

    //O(m+n) time nd space
    private static void mergeArray(int[] ar1, int[] ar2, int[] ar3) {

        int i=0;
        int j=0;
        int k=0;
        int m=ar1.length;
        int n=ar2.length;

        while(i<m && j<n){
            if(ar1[i]<ar2[j]){
                ar3[k]=ar1[i];
                k++;
                i++;
            }else {
                ar3[k]=ar2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            ar3[k]=ar1[i];
            k++;i++;
        }
        while(j<n){
            ar3[k]=ar2[j];
            k++;j++;
        }

    }
}
