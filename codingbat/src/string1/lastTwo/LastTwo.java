package string1.lastTwo;

public class LastTwo {

    /*
    CHALLENGE
    Given a string of any length, return a new string where the last 2 chars,
    if present, are swapped, so "coding" yields "codign".
     */

    public static void main(String[] args) {

        lastTwo("coding"); //"codign"
        lastTwo("cat"); //"cta"
        lastTwo("ab"); //"ba"
        lastTwo("a"); //"a"
    }

    public static String lastTwo(String str) {

        if(str.length() <= 1) {
            return str;
        }

        String result = str.substring(0, str.length() - 2);

        return result + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }
}
