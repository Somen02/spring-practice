package DataStructure.arrays;

import java.util.ArrayList;
import java.util.List;

public class LargestSumSubarray {
    public static void main(String[] args) {
        int[] arr={-3, 4, -1, -2, 1, 5};

        System.out.println(largestSum(arr));
        System.out.println(printMaxSumSubarray(arr));
    }

    //kadens algorithm
    private static int largestSum(int[] arr) {
        int res=0;
        int max_result=0;

        for(int i=0;i<arr.length;i++){
            max_result=Math.max(max_result+arr[i],arr[i]);

            res=Math.max(res,max_result);
        }
        return res;
    }

    private static List<Integer> printMaxSumSubarray(int[]arr){

        int res=0;
        int max_result=0;
        int start=0;int end=0;
        int curr=0;

        for (int i=0;i<arr.length;i++){
            max_result=max_result+arr[i];
            if(max_result<arr[i]){
                max_result=arr[i];
                curr=i;
            }
            if(max_result>res){
                res=max_result;
                start=curr;
                end=i;
            }
        }
        List<Integer> result= new ArrayList<>();

        for(int i=start;i<=end;i++){
            result.add(arr[i]);
        }
        return result;

    }
}
