package warmup1.frontBack;

public class FrontBack {

    /*
    CHALLENGE
    Given a string, return a new string where the first and last chars have been exchanged.
     */

    public static void main(String[] args) {

        frontBack("code"); //"eodc"
        frontBack("a"); //"a"
        frontBack("ab"); //"ba"
    }

    public static String frontBack(String str) {

        if (str.length() > 1) {

            String middle = str.substring(1, str.length() - 1);
            String total = str.charAt(str.length() - 1) + middle + str.charAt(0);

            return total;
        }
        return str;
    }
}
