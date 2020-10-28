package warmup1.notString;

public class NotString {

    /*
    CHALLENGE
    Given a string, return a new string where "not " has been added to the front.
    However, if the string already begins with "not", return the string unchanged.
    Note: use .equals() to compare 2 strings.
     */

    public static void main(String[] args) {

        notString("candy"); //"not candy"
        notString("x"); //"not x"
        notString("not bad"); //"not bad"
    }

    public static String notString(String str) {

        String not = "not ";

        if(str.startsWith("not")) {
            return str;
        }
        return not.concat(str);
    }
}
