package warmup1.missingChar;

public class MissingChar {

    /*
    CHALLENGE
    Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    The value of n will be a valid index of a char in the original string
    (i.e. n will be in the range 0..str.length()-1 inclusive).
     */

    public static void main(String[] args) {

        missingChar("kitten", 1); //"ktten"
        missingChar("kitten", 0); //"itten"
        missingChar("kitten", 4); //"kittn"
    }

    public static String missingChar(String str, int n) {

        String one = str.substring(0, n);
        String two = str.substring(n + 1, str.length());

        return one.concat(two);
    }
}
