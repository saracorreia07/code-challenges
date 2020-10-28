package warmup1.sumDouble;

public class SumDouble {

    /*
    CHALLENGE
    Given two int values, return their sum. Unless the two values are the same, then return double their sum.
     */

    public static void main(String[] args) {

        sumDouble(1, 2); //3
        sumDouble(3, 2); //5
        sumDouble(2, 2); //8
    }

    public static int sumDouble(int a, int b) {

        if( a == b) {
            return ((a +b) * 2);
        }
        return a + b;
    }
}
