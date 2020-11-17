package string1.hasBad;

public class HasBad {

    /*
    CHALLENGE
    Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
    such as with "badxxx" or "xbadxx" but not "xxbadxx".
    The string may be any length, including 0.
     */

    public static void main(String[] args) {

        hasBad("badxx"); //true
        hasBad("xbadxx"); //true
        hasBad("xxbadxx"); //false
    }

    public static boolean hasBad(String str) {

        if (str.length() <= 2) {
            return false;
        }

        String target = str.substring(0, 3);

        if (str.length() > 3) {
            String target2 = str.substring(1, 4);
            if (target2.equals("bad")) {
                return true;
            }
        }

        if (target.equals("bad")) {
            return true;
        }
        return false;
    }
}
