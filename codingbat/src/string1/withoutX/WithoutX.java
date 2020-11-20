package string1.withoutX;

public class WithoutX {

    /*
    CHALLENGE
    Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
    and otherwise return the string unchanged.
     */

    public static void main(String[] args) {

        withoutX("xHix"); //"Hi"
        withoutX("xHi"); //"Hi"
        withoutX("Hxix"); //"Hxi"
    }

    public static String withoutX(String str) {

        if (str.length() > 0 && str.startsWith("x")) {
            str = str.substring(1);
        }

        if (str.length() > 0 && str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }
}
