package DataStructure.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseInGroup {
    public static void main(String[] args) {
        ArrayList<Long> arr= new ArrayList<Long>(Arrays.asList(1L,2L,3L,4L,5L,6L,7L,8L));

        int k=3;
        reverseGroup(arr,k);

        for(Long i:arr){
            System.out.print(i+",");
        }
    }

    private static void reverseGroup(ArrayList<Long> arr, int k) {

        for(int i=0;i< arr.size();i+=k){
            int low=i;
            int high=Math.min(arr.size()-1,i+k-1 );
            while(low<high){
                Long temp = arr.get(low);
                arr.set(low,arr.get(high));
                arr.set(high,temp);
                low++;
                high--;
            }
        }
    }
}
