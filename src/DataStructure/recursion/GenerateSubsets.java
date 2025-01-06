package DataStructure.recursion;

import java.util.ArrayList;
import java.util.Collections;

public class GenerateSubsets {
    public static void main(String[] args) {
        String str = "abc";
        int index = 0;
        String curr = "";
        powerSet1(str, index, curr);
        ArrayList<String> ar = powerSet(str);
        Collections.sort(ar);

        for(String s: ar)
        {
            System.out.print(s+",");
        }
    }

    private static void powerSet1(String str, int index, String curr) {

        if(index==str.length()){
            System.out.println(curr);
            return;
        }

        powerSet1(str,index+1,curr+str.charAt(index));
        powerSet1(str,index+1,curr);
    }

    static ArrayList<String> powerSet(String s)
    {
        String curr="";
        ArrayList<String> ar= new ArrayList<String>();
        storePowerSet(ar,s,curr,0);
        return ar;
    }

    static void storePowerSet(ArrayList<String> ar, String s,String curr,int i){

        if(i==s.length()){
            ar.add(curr);
            return;
        }

        storePowerSet(ar,s,curr+s.charAt(i),i+1);
        storePowerSet(ar,s,curr,i+1);

    }
}
