package warmup2.stringTimes;

public class StringTimes {

    /*
    CHALLENGE
    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
     */

    public static void main(String[] args) {

        stringTimes("Hi", 2); //"HiHi"
        stringTimes("Hi", 3); //"HiHiHi"
        stringTimes("Hi", 1); //"Hi"
    }

    public static String stringTimes(String str, int n) {

        String result = "";

        for(int i = 0; i < n; i++) {
            result += str;
        }

        return result;
    }
}
