package search;

//binary search code
public class BinarySearch {
    public static void main(String arg[]){
        int[] ar = {2, 4, 5, 7, 9, 23, 45, 67, 89, 98};
        int target = 23;

        int result= binarySearchRec(ar,target,0,ar.length-1);
        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("element found in index "+result);
        }

    }

    private static int binarySearchRec(int[] ar, int target, int start, int end) {
        if(start>end)
            return -1;
        int mid= (start+end)/2;

        if(ar[mid]==target){
            return mid;
        } else if (ar[mid]>target) {
            return binarySearchRec(ar,target,start,mid-1);
        } else {
            return binarySearchRec(ar,target,mid+1,end);
        }
    }
}
