package string1.withoutX2;

public class WithoutX2 {

    /*
    CHALLENGE
    Given a string, if one or both of the first 2 chars is 'x',
    return the string without those 'x' chars, and otherwise return the string unchanged.
    This is a little harder than it looks.
     */

    public static void main(String[] args) {

        withoutX2("xHi"); //"Hi"
        withoutX2("Hxi"); //"Hi"
        withoutX2("Hi"); //"Hi"
    }

    public static String withoutX2(String str) {

        String result = "";

        if (str.length() > 0 && str.charAt(0) == 'x') {
            result = str.substring(1);

            if (str.length() > 1 && str.charAt(1) == 'x') {
                return str.substring(2);
            }
            return result;
        }

        if (str.length() > 0 && str.charAt(1) == 'x') {
            return str.charAt(0) + str.substring(2);
        }

        return str;
    }
}
