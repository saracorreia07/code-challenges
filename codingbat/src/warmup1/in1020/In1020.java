package warmup1.in1020;

public class In1020 {

    /*
    CHALLENGE
    Given 2 int values, return true if either of them is in the range 10..20 inclusive.
     */

    public static void main(String[] args) {

        in1020(12, 99); //true
        in1020(21, 12); //true
        in1020(8, 99); //false
    }

    public static boolean in1020(int a, int b) {

        return (a >= 10 && a <= 20 || b >= 10 && b <= 20);
    }
}
