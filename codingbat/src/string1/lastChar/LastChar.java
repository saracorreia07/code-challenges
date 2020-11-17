package string1.lastChar;

public class LastChar {

    /*
    CHALLENGE
    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
    so "yo" and "java" yields "ya".
    If either string is length 0, use '@' for its missing char.
     */

    public static void main(String[] args) {

        lastChars("last", "chars"); //"ls"
        //lastChars("yo", "java"); //"ya"
        lastChars("hi", ""); //"h@"
    }

    public static String lastChars(String a, String b) {

        if(a.equals("")){
            a = "@";
        }

        if(b.equals("")){
            b = "@";
        }

       return a.substring(0, 1) + b.substring(b.length() - 1);
    }
}
