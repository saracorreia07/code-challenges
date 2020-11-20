package string1.deFront;

public class DeFront {

    /*
    CHALLENGE
    Given a string, return a version without the first 2 chars.
    Except keep the first char if it is 'a' and keep the second char if it is 'b'.
    The string may be any length. Harder than it looks.
     */

    public static void main(String[] args) {

        deFront("Hello"); //"llo"
        deFront("abc"); //"abc"
        deFront("away"); //"aay"
    }

    public static String deFront(String str) {

        if (str.startsWith("ab")) {
            return str;
        }

        String target = str.substring(2);

        if (str.charAt(0) == 'a') {
            return str.charAt(0) + target;
        }

        if (str.charAt(1) == 'b') {
            return str.charAt(1) + target;
        }

        return target;
    }
}
