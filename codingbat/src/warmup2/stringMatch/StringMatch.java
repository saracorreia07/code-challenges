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
        stringMatch("he", "hello");
    }

    public static int stringMatch(String a, String b) {

        int count = 0;
        String c = "";

        if(a.length() < b.length()){
            c = a;
        } else {
            c = b;
        }

        for(int i = 0; i < c.length() - 1; i++){

            String result = a.substring(i, i + 2);

            String result2 = b.substring(i, i + 2);

            if ((result.equals(result2))) {
                count++;
            }
        }
        return count;
    }
}
