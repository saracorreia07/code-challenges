package warmup2.doubleX;

public class DoubleX {

    /*
    CHALLENGE
    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
     */

    public static void main(String[] args) {

        doubleX("axxbb"); //true
        doubleX("axaxax"); //false
        doubleX("xxxxx"); //true
    }

    public static boolean doubleX(String str) {

        boolean x = false;

        for (int i = 0; i < str.length() - 1; i++) {

            if ((str.charAt(i) == 'x') && !(str.charAt(i + 1) == 'x')) {
                break;
            }

            if ((str.charAt(i) == 'x') && (str.charAt(i + 1) == 'x')) {
                x = true;
            }
        }
        return x;
    }
}
