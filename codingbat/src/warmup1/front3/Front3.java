package warmup1.front3;

public class Front3 {

    /*
    CHALLENGE
    Given a string, we'll say that the front is the first 3 chars of the string.
    If the string length is less than 3, the front is whatever is there.
    Return a new string which is 3 copies of the front.
     */

    public static void main(String[] args) {
        front3("Java"); //"JavJavJav"
        front3("Chocolate"); //"ChoChoCho"
        front3("abc"); //"abcabcabc"
    }

    public static String front3(String str) {

        if(str.length() >= 3){

            String newStr = str.substring(0, 3);

            return newStr.concat(newStr + newStr);
        }

        str = str.concat(str + str);
        return str;
    }
}
