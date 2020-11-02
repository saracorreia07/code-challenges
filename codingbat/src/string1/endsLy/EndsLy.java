package string1.endsLy;

public class EndsLy {

    /*
    CHALLENGE
    Given a string, return true if it ends in "ly".
     */

    public static void main(String[] args) {
        endsLy("oddly"); //true
        endsLy("ly"); //true
        endsLy("oddy"); //false
    }

    public static boolean endsLy(String str) {

        if (str.length() > 1 && str.charAt(str.length() - 1) == 'y' && str.charAt(str.length() - 2) == 'l') {
            return true;
        }
        return false;
    }
}
