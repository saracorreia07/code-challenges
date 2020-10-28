package warmup1.close10;

public class Close10 {

    /*
    CHALLENGE
    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
    Note that Math.abs(n) returns the absolute value of a number.
     */

    public static void main(String[] args) {

        close10(8, 13); //8
        close10(13, 8); //8
        close10(13, 7); //0
    }

    public static int close10(int a, int b) {

        int num1 = Math.abs(10 - a);
        int num2 = Math.abs(10 - b);

        if(num1 == num2){
            return 0;
        }

        if (num1 < num2) {
            return a;
        }

        return b;
    }
}
