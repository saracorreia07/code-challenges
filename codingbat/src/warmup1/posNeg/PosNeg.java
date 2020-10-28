package warmup1.posNeg;

public class PosNeg {

    /*
    CHALLENGE
    Given 2 int values, return true if one is negative and one is positive.
    Except if the parameter "negative" is true, then return true only if both are negative.
     */

    public static void main(String[] args) {

        posNeg(1, -1, false); //true
        posNeg(-1, 1, false); //true
        posNeg(-4, -5, true); //true
    }

    public static boolean posNeg(int a, int b, boolean negative) {

        if(!negative) {
            if((a > 0 && b < 0) || (a < 0 && b > 0)){
                return true;
            }
        }

        if(a < 0 && b < 0 && negative) {
            return true;
        }
        return false;
    }
}
