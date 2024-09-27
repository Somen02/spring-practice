package DataStructure.bitoperation;

public class MaxAndValue {
    public static void main(String[] args) {
        int[] arr= {4,6,8,5};
        System.out.println("the max and value of a pair is:- "+maxAndVal(arr,arr.length));
    }

    private static int maxAndVal(int[] arr, int length) {
        int res=0;

        for(int bit=31; bit>=0;bit--){
            int count=0;

            //count of element having set bit
            count = checkBits(res|(1<<bit),arr,length);

            if(count>=2){
                res = res | (1<<bit);
            }
        }

        return res;

    }

    private static int checkBits(int pattern, int[] arr, int length) {
        int count=0;
        for(int i=0; i<length; i++){
            if((pattern & arr[i]) == pattern){
                count++;
            }
        }
        return count;
    }
}
