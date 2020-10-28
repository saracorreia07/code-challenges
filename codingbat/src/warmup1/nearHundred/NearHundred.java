package warmup1.nearHundred;

public class NearHundred {

    /*
    CHALLENGE
    Given an int n, return true if it is within 10 of 100 or 200.
    Note: Math.abs(num) computes the absolute value of a number.
     */

    public static void main(String[] args) {

        nearHundred(93); //true
        nearHundred(90); //true
        nearHundred(89); //false
    }

    public static boolean nearHundred(int n) {

        return (n >= 90 && n <= 110 || n >= 190 && n <= 210);
    }

}
