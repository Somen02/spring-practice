package DataStructure.recursion;


public class PrintingAllPermutation {
    public static void main(String[] args) {
        String str ="ABC";
        int length=str.length();
        permutation(str,length,0);
    }

    public static void permutation(String str,int len,int strt){

        if(strt==len){
            System.out.println(str);
        }

        for(int i=strt ; i<len ;i++){
            str=swap(str,strt,i);
            permutation(str,len,strt+1);
            str=swap(str,strt,i);
        }
    }

    private static String swap(String str, int strt, int i) {

        char []charArr=str.toCharArray();
        char temp;
        temp=charArr[strt];
        charArr[strt]=charArr[i];
        charArr[i]=temp;

        return String.valueOf(charArr);

    }
}
