package warmup1.front22;

public class Front22 {

    /*
    CHALLENGE
    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
    so "kitten" yields"kikittenki".
    If the string length is less than 2, use whatever chars are there.
     */

    public static void main(String[] args) {
        front22("kitten"); //"kikittenki"
        front22("Ha"); //"HaHaHa"
        front22("abc"); //"ababcab"
    }

    public static String front22(String str) {

        if(str.length() > 2){

            String newStr = str.substring(0, 2);

            return newStr + str + newStr;
        }
        return str + str + str;
    }
}
