package DataStructure.bitoperation;

public class TwoOddOccuring {
    public static void main(String[] args) {
        int [] arr = {3,3,8,7,8,3,8,7,8,7};

        findTwoOddOccuring(arr);
    }

    private static void findTwoOddOccuring(int[] arr) {

        int x=0;
        for (int i=0;i<arr.length;i++){
            x=x^arr[i];
        }
        int k=x&(~(x-1));

        int res1=0;
        int res2=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]&k) !=0){
                res1=res1^arr[i];//odd numbers xor
            }else{
                res2=res2^arr[i];
            }
        }
        System.out.println("the two numbers are :"+res1+","+res2);
    }
}
