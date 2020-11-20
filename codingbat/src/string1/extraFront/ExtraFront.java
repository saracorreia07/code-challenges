package string1.extraFront;

public class ExtraFront {

    /*
    CHALLENGE
    Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    The string may be any length. If there are fewer than 2 chars, use whatever is there
     */

    public static void main(String[] args) {

        extraFront("Hello"); //"HeHeHe"
        extraFront("ab"); //"ababab"
        extraFront("H"); //"HHH"
    }

    public static String extraFront(String str) {

        if(str.length() < 2){
            return str + str + str;
        }

        String result = str.substring(0, 2);

        return result + result + result;
    }
}
