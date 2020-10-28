package warmup1.max1020;

public class Max1020 {

    /*
    CHALLENGE
    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
    or return 0 if neither is in that range.
     */

    public static void main(String[] args) {

        max1020(11, 19); //19
        max1020(19, 11); //19
        max1020(11, 9); //11
    }

    public static int max1020(int a, int b) {

        if(!(a >= 10 && a <= 20) && !(b >= 10 && b <= 20)) {
            return 0;
        }

        if ((a >= 10 && a <= 20) && a > b) {
            return a;
        }

        if((b >= 10 && b <= 20) && b > a){
            return b;
        }
        return Math.min(a, b);
    }
}
