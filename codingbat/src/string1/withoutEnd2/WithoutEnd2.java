package string1.withoutEnd2;

public class WithoutEnd2 {

    /*
    CHALLENGE
    Given a string, return a version without both the first and last char of the string.
    The string may be any length, including 0.
     */

    public static void main(String[] args) {

        withouEnd2("Hello"); //"ell"
        withouEnd2("abc"); //"b"
        withouEnd2("ab"); //""
    }

    public static String withouEnd2(String str) {

        if(str.length() <= 1){

            return "";
        }
        return str.substring(1, str.length() - 1);
    }
}
