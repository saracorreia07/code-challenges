package warmup1.or35;

public class Or35 {

    /*
    CHALLENGE
    Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
    Use the % "mod" operator
     */

    public static void main(String[] args) {

        or35(3); //true
        or35(10); //true
        or35(8); //false
    }

    public static boolean or35(int n) {

        return (n % 3 == 0 || n % 5 == 0);
    }
}
