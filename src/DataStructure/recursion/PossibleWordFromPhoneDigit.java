package DataStructure.recursion;

import java.util.ArrayList;

public class PossibleWordFromPhoneDigit {

    public static void main(String[] args) {
        int[] ar={2,3};
        int N=ar.length;
        ArrayList<String> poWord=possibleWords(ar,N);
        for(String s:poWord){
            System.out.println(s);
        }
    }

    static ArrayList<String> possibleWords(int a[], int N)
    {
        String[] mp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String curr="";
        ArrayList<String> res = new ArrayList<>();
        possibleWord(a,N,mp,curr,res,0);
        return res;
    }

    public static void possibleWord(int[] a,int N,String[] mp,String curr,ArrayList<String> res,int i){
        if(i==N){
            res.add(curr);
            return;
        }

        String charec=mp[a[i]];

        for(char c:charec.toCharArray()){
            possibleWord(a,N,mp,curr+c,res,i+1);
        }

    }
}
