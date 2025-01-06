package DataStructure.bitoperation;

public class LongestConsecutive1s {
    public static void main(String[] args) {
        int N = 222;

        int max=findLongestConsecutive1s(N);
        System.out.println("the longest consecutive 1s are: "+max);
    }

    public static int findLongestConsecutive1s(int N) {

        // Your code here
        int max=0;
        int count=0;

        while(N>0){
            if((N&1)==1){ // if odd number then will check the consecutive 1's
                count++;
                max=Math.max(max,count);
            }else{
                count=0;
            }
            N=N>>1;
        }
        return max;

    }
}
