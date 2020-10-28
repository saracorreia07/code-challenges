package warmup1.lastDigit;

public class LastDigit {

    /*
    CHALLENGE
    Given two non-negative int values,
    return true if they have the same last digit, such as with 27 and 57.
    Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
     */

    public static void main(String[] args) {

        lastDigit(7, 17); //true
        lastDigit(6, 17); //false
        lastDigit(3, 113); //true
    }

    public static boolean lastDigit(int a, int b) {

        int x = a % 10;

        return (b % 10 == x);
    }
}
