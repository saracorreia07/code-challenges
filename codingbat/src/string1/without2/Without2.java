package string1.without2;

public class Without2 {

    /*
    CHALLENGE
    Given a string, if a length 2 substring appears at both its beginning and end,
    return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
    The substring may overlap with itself, so "Hi" yields "".
    Otherwise, return the original string unchanged.
     */

    public static void main(String[] args) {

        without2("HelloHe"); //"lloHe"
        without2("HelloHi"); //"HelloHi"
        without2("x"); //""
    }

    public static String without2(String str) {

        if(str.length() <= 1) {
            return str;
        }

        String target = str.substring(0, 2);

        if(str.endsWith(target)) {
            return str.substring(2);
        }
        return str;
    }
}
