package DataStructure.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        reverseTheArray(arr,arr.length);

        for(int num:arr){
            System.out.println(num);
        }
    }

    private static void reverseTheArray(int[] arr, int length) {

        int low=0; int high=length-1;

        while(low<high){
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;

            low++;
            high--;
        }
    }
}
