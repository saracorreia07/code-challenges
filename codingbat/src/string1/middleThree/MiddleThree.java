package string1.middleThree;

public class MiddleThree {

    /*
    CHALLENGE
    Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
    The string length will be at least 3.
     */

    public static void main(String[] args) {

        middleThree("Candy"); //"and"
        middleThree("and"); //"and"
        middleThree("solving"); //"lvi"
    }

    public static String middleThree(String str) {

        int target = str.length() / 2;

        return str.substring(target - 1, target + 2);
    }
}
