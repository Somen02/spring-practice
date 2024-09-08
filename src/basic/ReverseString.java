package basic;

// Reverse a string
public class ReverseString {

    public static void main(String args[]) {
        String name = "Somen";

        String nstr = "";

        for (int i = 0; i < name.length(); i++) {
            nstr = name.charAt(i) + nstr;
        }

        System.out.println("reversed String is:- " + nstr);
    }
}
