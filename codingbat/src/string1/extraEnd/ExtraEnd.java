package string1.extraEnd;

public class ExtraEnd {

    /*
    CHALLENGE
    Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    The string length will be at least 2.
     */

    public static void main(String[] args) {

        extraEnd("Hello"); //"lololo"
        //extraEnd("ab"); //"ababab"
        //extraEnd("Hi"); //"HiHiHi"
    }

    public static String extraEnd(String str) {

        String target = str.substring(str.length() - 2);
        String result = "";

        for(int i = 0; i < 3; i++){

            result += target;
        }
        return result;
    }
}
