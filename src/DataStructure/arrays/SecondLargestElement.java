package DataStructure.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr={12,35,1,8,34,23};

        findSecondLargest(arr,arr.length);
    }

    private static void findSecondLargest(int[] arr, int length) {

        if(length<2){
            System.out.println("not valid");
            return;
        }

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i=0;i<length;i++){

            if(arr[i]>first){
                second=first;
                first=arr[i];
            } else if (arr[i]!=first && arr[i]>second) {
                second = arr[i];
            }

        }
        if(second==Integer.MIN_VALUE){
            System.out.println("no second Largest");
        }else{
            System.out.println("Second largest number is "+second);
        }
    }
}
