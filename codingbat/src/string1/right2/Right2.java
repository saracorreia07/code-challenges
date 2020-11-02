package string1.right2;

public class Right2 {

    /*
    CHALLENGE
    Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
    The string length will be at least 2.
     */

    public static void main(String[] args) {

        right2("Hello"); //"loHel"
        right2("java"); //"vaja"
        right2("Hi"); //"Hi"
    }

    public static String right2(String str) {

        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }
}
