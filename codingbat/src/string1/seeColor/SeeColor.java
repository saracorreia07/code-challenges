package string1.seeColor;

public class SeeColor {

    /*
    CHALLENGE
    Given a string, if the string begins with "red" or "blue" return that color string,
    otherwise return the empty string.
     */

    public static void main(String[] args) {

        seeColor("redxx"); //"red"
        seeColor("xxred"); //""
        seeColor("blueTimes"); //"blue"
    }

    public static String seeColor(String str) {

        String red = "red";
        String blue = "blue";

        if(str.startsWith("red")){
            return red;
        }

        if(str.startsWith("blue")){
            return blue;
        }

        return "";
    }
}
