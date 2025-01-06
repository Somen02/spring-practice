package DataStructure.arrays;

// array is either in ascending or desc and it is rotated
public class SortedAndRotated {

    public static void main(String[] args) {
        int[] arr={3,4,1,2};

        int length=arr.length;

        if(checkSortedAndRoatated(arr,length)){
            System.out.println("Yes it is sorted and roatated");
        }
        else{
            System.out.println("NO");
        }
    }

    private static boolean checkSortedAndRoatated(int[] arr, int n) {

        if(arr[0]>arr[n-1]){
            int count=0;
            for(int i=0;i<n;i++){
                if(arr[i]>arr[(i+1)%n]){
                    count++;
                }
            }
            return count==1;
        } else if (arr[0]<arr[n-1]) {
            int count=0;
            for (int i=0;i<n;i++){
                if(arr[i]<arr[(i+1)%n]){
                    count++;
                }
            }
            return count==1;
        }
        return false;
    }
}
