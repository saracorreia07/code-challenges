package warmup1.intMax;

public class IntMax {

    /*
    CHALLENGE
    Given three int values, a b c, return the largest.
     */

    public static void main(String[] args) {

        intMax(1, 2, 3); //3
        intMax(1, 3, 2); //3
        intMax(3, 2, 1); //3
    }

    public static int intMax(int a, int b, int c) {

        int max = Math.max(a, b);

        if (max > c) {
            return max;
        }
        return c;
    }
}
