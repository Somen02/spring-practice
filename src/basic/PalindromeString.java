package basic;

//Write a Program to Find Weather the String is Palindrome or Not.
//Input: DAD
//Output: DAD – is a Palindrome
public class PalindromeString {

    public static void main(String args[]) {
        String name = "daaad";
        String pal="";

        for (int i = name.length() - 1; i >= 0; i--) {
            pal=pal+name.charAt(i);
        }
        if(pal.equalsIgnoreCase(name)){
            System.out.println("palindrome String");
        }
        else{
            System.out.println("not a palindrome");
        }

        if(checkPalindrome(name,0,name.length()-1)){
            System.out.println("palindrome String");
        }
        else {
            System.out.println("not a palindrome");
        }
    }

    private static boolean checkPalindrome(String name, int start, int end) {

        if(start>=end){
            return true;
        }
        return (name.charAt(start)==name.charAt(end)) && checkPalindrome(name,start+1,end-1);
    }
}
