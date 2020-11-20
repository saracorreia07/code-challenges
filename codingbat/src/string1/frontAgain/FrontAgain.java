package string1.frontAgain;

public class FrontAgain {

    /*
    CHALLENGE
    Given a string, return true if the first 2 chars in the string also appear at the end of the string,
    such as with "edited".
     */

    public static void main(String[] args) {

        frontAgain("edited"); //true
        frontAgain("edit"); //false
        frontAgain("ed"); //true
    }

    public static boolean frontAgain(String str) {

        if(str.length() < 2){
            return false;
        }

        String target = str.substring(0, 2);

        if(str.endsWith(target)){
            return true;
        }

        return false;
    }
}
