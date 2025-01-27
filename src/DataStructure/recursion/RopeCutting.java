package DataStructure.recursion;

//Given a rope of length N meters, and the rope can be cut in only 3 sizes A, B and C.
// The task is to maximizes the number of cuts in rope. If it is impossible to make cut then print the number else print -1
//*time complexity is O(3^n) better is dynamic programming
public class RopeCutting {

    public static void main(String[] args) {
        int n = 5, a = 2, b = 1, c = 5;

        System.out.println(maxCuts(n, a, b, c));
    }

    private static int maxCuts(int n, int a, int b, int c) {

        if(n==0){
            return 0;
        }
        if(n<=-1)
        {
            return -1;
        }

        int res = Math.max(maxCuts(n-a,a,b,c),
                Math.max(maxCuts(n-b,a,b,c),maxCuts(n-c,a,b,c)));

        if(res==-1){
            return res;
        }
        return res+1;
    }
}
