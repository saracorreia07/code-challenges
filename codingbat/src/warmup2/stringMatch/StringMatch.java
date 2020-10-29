package warmup2.stringMatch;

public class StringMatch {

    /*
    CHALLENGE
    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
     */

    public static void main(String[] args) {

        stringMatch("xxcaazz", "xxbaaz"); //3
        stringMatch("abc", "abc"); //2
        stringMatch("abc", "axc"); //0
    }

    public static int stringMatch(String a, String b) {

        int count = 0;

        return count;
    }
}
