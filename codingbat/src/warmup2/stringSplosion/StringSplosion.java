package warmup2.stringSplosion;

public class StringSplosion {

    /*
    CHALLENGE
    Given a non-empty string like "Code" return a string like "CCoCodCode".
     */

    public static void main(String[] args) {

        stringSplosion("Code"); //"CCoCodCode"
        stringSplosion("abc"); //"aababc"
        stringSplosion("ab"); //"aab"
    }

    public static String stringSplosion(String str) {

        String result = "";

        for(int i = 0; i < str.length(); i++) {

            result += str.substring(0, i + 1);
        }
        return result;
    }
}
