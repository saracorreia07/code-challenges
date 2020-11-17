package string1.atFirst;

public class AtFirst {

    /*
    CHALLENGE
    Given a string, return a string length 2 made of its first 2 chars.
    If the string length is less than 2, use '@' for the missing chars.
     */

    public static void main(String[] args) {

        atFirst("hello"); //"he"
        atFirst("hi"); //"hi"
        atFirst("h"); //"h@"
    }

    public static String atFirst(String str) {

        if(str.equals("")){
            return "@@";
        }

        if(str.length() <= 1){
            return str + "@";
        }
            return str.substring(0, 2);
        }
}
