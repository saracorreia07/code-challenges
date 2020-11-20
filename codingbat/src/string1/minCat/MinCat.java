package string1.minCat;

public class MinCat {

    /*
    CHALLENGE
    Given two strings, append them together (known as "concatenation") and return the result.
    However, if the strings are different lengths,
    omit chars from the longer string so it is the same length as the shorter string.
    So "Hello" and "Hi" yield "loHi".
    The strings may be any length.
     */

    public static void main(String[] args) {

        minCat("Hello", "Hi"); //"loHi"
        minCat("Hello", "java"); //"ellojava"
        minCat("java", "Hello"); //"javaello"
    }

    public static String minCat(String a, String b) {

        int result = 0;

        if(a.length() < b.length()) {
            result = a.length();
            return a + b.substring(b.length() - result);
        }
        result = b.length();
        return a.substring(a.length() - result) + b;
    }
}
