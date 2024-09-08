package basic;

//Write a Program to Find Weather the String is Palindrome or Not.
//Input: DAD
//Output: DAD – is a Palindrome
public class PalindromeString {

    public static void main(String args[]) {
        String name = "DADad";
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
    }
}
