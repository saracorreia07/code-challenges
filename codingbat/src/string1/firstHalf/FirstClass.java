package string1.firstHalf;

public class FirstClass {

    /*
    CHALLENGE
    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
     */

    public static void main(String[] args) {

        firstHalf("WooHoo"); //"Woo"
        firstHalf("HelloThere"); //"Hello"
        firstHalf("abcdef"); //"abc"
    }

    public static String firstHalf(String str) {

        int wordLength = str.length() / 2;

        return str.substring(0, wordLength);
    }
}
