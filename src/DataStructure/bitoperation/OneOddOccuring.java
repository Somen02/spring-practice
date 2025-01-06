package DataStructure.bitoperation;

public class OneOddOccuring {
    public static void main(String[] args) {
        int [] arr = {4,4,8,7,8,4,8,7,8};

        findOneOddOccuring(arr);
    }

    private static void findOneOddOccuring(int[] arr) {

        int result=0;
        for (int i=0;i<arr.length;i++){
            result=result^arr[i];
        }
        System.out.println("the odd occurring element is : "+result);
    }
}
